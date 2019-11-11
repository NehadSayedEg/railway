package com.extenddev.railway.pcm.UI;

import android.app.ProgressDialog;
import android.content.Intent;
import android.inputmethodservice.ExtractEditText;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatSpinner;
import androidx.lifecycle.LiveData;

import com.extenddev.railway.pcm.Database.AgentDao;
import com.extenddev.railway.pcm.Database.AgentDatabase;
import com.extenddev.railway.pcm.Database.DatabaseEntities.AgRoleElm;
import com.extenddev.railway.pcm.Database.DatabaseEntities.AgentList;
import com.extenddev.railway.pcm.R;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnItemSelected;

public class JobCheckActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    @BindView(R.id.userIDTextView)
    TextView userIDTextView;
    @BindView(R.id.userIDEditText)
    ExtractEditText userIDEditText;
    @BindView(R.id.checkBtn)
    Button checkBtn;
    @BindView(R.id.passwordTextview)
    TextView passwordTextview;
    @BindView(R.id.jobSpinner)
    AppCompatSpinner jobSpinner;
    @BindView(R.id.confirmBtn)
    Button confirmBtn;
    private AgRoleElm AgRoleElm;


    private AgentDao agentDao;
    private ProgressDialog progressDialog;

    private LiveData<AgentList> agentList;
    private AgentDatabase database;
    String agentUserName;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_job_check);
        ButterKnife.bind(this);

        agentUserName = userIDEditText.getText().toString();


        progressDialog = new ProgressDialog(this);
        progressDialog.setCancelable(false);
        progressDialog.setMessage("Check Agent...");
        progressDialog.setProgressStyle(ProgressDialog.STYLE_SPINNER);
        progressDialog.setProgress(0);

           checkBtn.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View v) {
                   userNameValidation();
               }
           });


       //jobSpinner.setOnItemSelectedListener(this);
       // ArrayList<String> list = new ArrayList<String>();
       // list.add("RANJITH");
       // list.add("ARUN");

       ArrayAdapter<AgRoleElm> adapter =  new ArrayAdapter<AgRoleElm>(this ,android.R.layout.simple_spinner_dropdown_item);



        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
       jobSpinner.setAdapter(adapter);
       jobSpinner.setOnItemSelectedListener(this);

    }




    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        AgRoleElm  agRoleElm= (AgRoleElm) parent.getSelectedItem();
        displayRole(agRoleElm);
        String selectedRole = parent.getItemAtPosition(position).toString();
        if(selectedRole.equals("26")){
            Intent intent = new Intent(JobCheckActivity.this ,CheckStationActivity.class );
            startActivity(intent);
        }
        if(selectedRole.equals("28")) {

        }
        if(selectedRole.equals("29")){

        }

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }

        public void getSelectd(View view){
            AgRoleElm  agRoleElm = (AgRoleElm)jobSpinner.getSelectedItem();
            displayRole(agRoleElm);
    }
    public void displayRole(AgRoleElm agRoleElm){
        int  roleId = agRoleElm.getAgRoleElm();

    }

    private void userNameValidation() {
            if (!emptyValidation()) {
                progressDialog.show();
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        agentList = agentDao.CheckAgent(agentUserName);

                        if(agentList!=null){


                            finish();
                        }else{
                            Toast.makeText(JobCheckActivity.this, "Please Write a valid UserName ",
                                    Toast.LENGTH_SHORT).show();
                        }
                        progressDialog.dismiss();
                    }
                }, 1000);

            }else{
                Toast.makeText(JobCheckActivity.this, "Please Enter your UserName", Toast.LENGTH_SHORT).show();
            }
        }


        private boolean emptyValidation() {
            if (TextUtils.isEmpty(agentUserName)) {
                return true;
            }else {
                return false;
            }

    }




}
