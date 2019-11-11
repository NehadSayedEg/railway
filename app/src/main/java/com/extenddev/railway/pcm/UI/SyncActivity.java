package com.extenddev.railway.pcm.UI;

import android.app.ProgressDialog;
import android.content.Intent;
import android.inputmethodservice.ExtractEditText;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationManagerCompat;
import androidx.core.content.ContextCompat;

import com.extenddev.railway.pcm.Data.Data;
import com.extenddev.railway.pcm.Data.Satitions.NodeList;
import com.extenddev.railway.pcm.Database.AgentDao;
import com.extenddev.railway.pcm.Database.AgentDatabase;
import com.extenddev.railway.pcm.Database.AppDatabase;
import com.extenddev.railway.pcm.Database.DatabaseEntities.AgentList;
import com.extenddev.railway.pcm.Encryption.CrypLib;
import com.extenddev.railway.pcm.Encryption.CustomsEnc;
import com.extenddev.railway.pcm.ForegroundNotification.NotificationService;
import com.extenddev.railway.pcm.Network.interfaceApi;
import com.extenddev.railway.pcm.R;
import com.extenddev.railway.pcm.ViewModel.AgentViewModel;
import com.extenddev.railway.pcm.ViewModel.AppExecutors;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.gson.Gson;

import java.util.concurrent.TimeUnit;

import butterknife.BindView;
import butterknife.ButterKnife;
import okhttp3.OkHttpClient;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


public class SyncActivity extends AppCompatActivity {

    private final AppCompatActivity activity = SyncActivity.this;
    private AgentDatabase  agentDatabase;
    AgentDao agentDao ;

  //  private com.extenddev.railway.pcm.Database.DatabaseEntities.Data data;
    //Encryption:
    public static String KEY_Encryption = "11BF04D9F2CD40EAA76EC59B094F89E1";
    public static String IV_Encryption = "uicF8Q6kFiEJJcHo";


    private NotificationManagerCompat notificationManager;


    @BindView(R.id.deviceIdEditText)
    ExtractEditText deviceIdEditText;
    @BindView(R.id.severIdEditText)
    ExtractEditText severIdEditText;
    @BindView(R.id.fab)
    FloatingActionButton SyncBtn;
    @BindView(R.id.lastupdate)
    TextView lastupdate;

    private AgentList agentList ;
    private ProgressDialog pd ;
     private AppDatabase appDatabase ;
   String  result ;
   private AgentViewModel agentViewModel;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sync);
        ButterKnife.bind(this);
        appDatabase =AppDatabase .getAppDatabase((getApplicationContext()));




        pd = new ProgressDialog(this);
        pd.setCancelable(false);
        pd.setMessage("loading");


        SyncBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pd.show();
                SyncAgent();
                NodeCall();

                    //syncProcess();
                saveData(agentList);
                login();
            }
            public void parseJson (){

        Gson gson = new Gson();
        String json  = result ;
        Data data = gson.fromJson(json, Data.class);
       // lastupdate.setText(data.getAgentList().get(2).getAgentFirstName());
    }

            private String decrypt(String text) throws Exception {
                String result = new CrypLib().decrypt(text, KEY_Encryption, IV_Encryption);
                return result;
            }


            private void  NodeCall(){
                OkHttpClient client = new OkHttpClient.Builder()
                        .connectTimeout(10, TimeUnit.MINUTES)
                        .writeTimeout(10, TimeUnit.MINUTES)
                        .readTimeout(10, TimeUnit.MINUTES)
                        .build();

                Retrofit retrofit = new Retrofit.Builder().baseUrl("http://locationme.com/")
                        .addConverterFactory(GsonConverterFactory.create()).client(client).build();

                interfaceApi Api = retrofit.create(interfaceApi.class);
                Call<NodeList> callNodeList = Api.getAllNodes();
              callNodeList.enqueue(new Callback<NodeList>() {
                  @Override
                  public void onResponse(Call<NodeList> call, Response<NodeList> response) {
                      Log.e("FROM NODELIST ********************","HIIIIIIIIIII"+response.body().getNodeNameAr());
                      pd.dismiss();

                  }

                  @Override
                  public void onFailure(Call<NodeList> call, Throwable t) {
                      Log.e("ERROR", Log.getStackTraceString(t));

                      t.printStackTrace();
                      pd.dismiss();




                  }
              });
            }

          private  void  SyncAgent() {
              OkHttpClient client = new OkHttpClient.Builder()
                      .connectTimeout(10, TimeUnit.MINUTES)
                      .writeTimeout(10, TimeUnit.MINUTES)
                      .readTimeout(10, TimeUnit.MINUTES)
                      .build();

              Retrofit retrofit = new Retrofit.Builder().baseUrl("http://locationme.com/")
                      .addConverterFactory(GsonConverterFactory.create()).client(client).build();

              interfaceApi Api = retrofit.create(interfaceApi.class);
              Call<Data> callagentList = Api.getAllData();
              callagentList.enqueue(new Callback<Data>() {
                  @Override
                  public void onResponse(Call<Data> call, Response<Data> response) {
                      Log.e("from Response@@@@@@@@@","HIIIIIIIIIII"+response.toString());
                      Log.e("from Response@@@@@@@@@","HIIIIIIIIIII"+response);
                      Log.e("from Response@@@@@@@@@","HIIIIIIIIIII"+response.body().toString());
                      Log.e("from Response@@@@@@@@@","HIIIIIIIIIII"+response.code());

                      // print encrypted string .........
                      Log.e("from Response@@@@@@@@@","HIIIIIIIIIII"+response.body().getAgentList());


                      pd.dismiss();


                  }

                  @Override
                  public void onFailure(Call<Data> call, Throwable t) {
                      t.printStackTrace();

                      lastupdate.setText(t.getMessage());
                      pd.dismiss();


                  }
              });





          }

            private void syncProcess(){

                OkHttpClient client = new OkHttpClient.Builder()
                        .connectTimeout(10, TimeUnit.MINUTES)
                        .writeTimeout(10, TimeUnit.MINUTES)
                        .readTimeout(10, TimeUnit.MINUTES)
                        .build();

                Retrofit retrofit = new Retrofit.Builder().baseUrl("http://locationme.com/")
                        .addConverterFactory(GsonConverterFactory.create()).client(client).build();

                interfaceApi Api =  retrofit.create(interfaceApi.class);
                Call<CustomsEnc> call = Api.getAllDataDecrepted();
                call.enqueue(new Callback<CustomsEnc>() {
                    @Override
                    public void onResponse(Call<CustomsEnc> call, Response<CustomsEnc> response) {
                        Log.e("from Response@@@@@@@@@","HIIIIIIIIIII"+response.toString());
                        Log.e("from Response@@@@@@@@@","HIIIIIIIIIII"+response);
                        Log.e("from Response@@@@@@@@@","HIIIIIIIIIII"+response.body().toString());
                        Log.e("from Response@@@@@@@@@","HIIIIIIIIIII"+response.code());

                        // print encrypted string .........
                        Log.e("from Response@@@@@@@@@","HIIIIIIIIIII"+response.body().getCustomsEncResponse());

                        // decrypt
                        try {
                             result = decrypt(""+response.body().getCustomsEncResponse());
                            Log.e("from Response@@@@@@@@@","HIIIIIIIIIII"+result);

                            parseJson();
                           // lastupdate.append("\n"+ result);

                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                        pd.dismiss();

                    }

                    @Override
                    public void onFailure(Call<CustomsEnc> call, Throwable t) {
                        Log.e("ERROR", Log.getStackTraceString(t));

                        pd.dismiss();
                        t.printStackTrace();

                        lastupdate.setText(t.getMessage());

                        // lastupdate.setText(t.getMessage());

                        // Log.d("Error@@@@@@@@@@@@@","#########################");
                    }
                });
            }});
    }



    public void startService(View v) {
        Intent serviceIntent = new Intent(this , NotificationService.class);
        //serviceIntent.putExtra("input" , input);
        ContextCompat.startForegroundService( this , serviceIntent);
    }

    public void stopService(View v ) {
        Intent serviceIntent = new Intent(this , NotificationService.class);
        stopService(serviceIntent);
    }

    public void login(){
        Intent loginIntent = new Intent(SyncActivity.this,LoginActivity.class);
        startActivity(loginIntent);
    }

    public void saveData( AgentList agentList){
          agentList = new AgentList();
        AppExecutors.getInstance().diskIO().execute(new Runnable() {
            @Override
            public void run() {
                agentDatabase.getAgentDao().getUser();
            }
        });
    }


}



//    public  void LastSyncTime(){
//        Calendar calendar = Calendar.getInstance();
//        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy.MM.dd G 'at' HH:mm:ss z");
//        String time = simpleDateFormat.format(calendar.getTime());
//        lastupdate.setText(time);
//
//
//
////        SharedPreferences prefs = "";
////        prefs.edit().putLong("time", date.getTime()).apply();
////
////        Date myDate = new Date(prefs.getLong("time", 0));
//            }
//
//
//
//
//
//
//
//
//    public void startService(View v) {
//        Intent serviceIntent = new Intent(this , NotificationService.class);
//        //serviceIntent.putExtra("input" , input);
//        ContextCompat.startForegroundService( this , serviceIntent);
//    }
//
//    public void stopService(View v ) {
//        Intent serviceIntent = new Intent(this , NotificationService.class);
//        stopService(serviceIntent);
//    }
//
//    public void login(){
//        Intent loginIntent = new Intent(SyncActivity.this, LoginActivity.class);
//        startActivity(loginIntent);
//
//
//
//    }
//
//
//}
//
//
