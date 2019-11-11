package com.extenddev.railway.pcm.UI;

import android.app.ProgressDialog;
import android.content.Intent;
import android.inputmethodservice.ExtractEditText;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.LiveData;
import androidx.room.Room;

import com.extenddev.railway.pcm.Database.AgentDao;
import com.extenddev.railway.pcm.Database.AgentDatabase;
import com.extenddev.railway.pcm.Database.DatabaseEntities.AgentList;
import com.extenddev.railway.pcm.R;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class LoginActivity extends AppCompatActivity {

    @BindView(R.id.userNameTextView)
    TextView userNameTextView;
    @BindView(R.id.userNameEditText)
    ExtractEditText userNameEditText;
    @BindView(R.id.passwordTextview)
    TextView passwordTextview;
    @BindView(R.id.passwordEditText)
    ExtractEditText passwordEditText;
    @BindView(R.id.loginBtn)
    Button loginBtn;

    private AgentDao agentDao;
    private ProgressDialog progressDialog;

    private LiveData<List<AgentList>> agentList;
    private AgentDatabase database;
    String agentUserName, agentUserPwd;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        ButterKnife.bind(this);
        agentUserName = userNameEditText.getText().toString();
        agentUserPwd = passwordEditText.getText().toString();


        progressDialog = new ProgressDialog(this);
        progressDialog.setCancelable(false);
        progressDialog.setMessage("Check Agent...");
        progressDialog.setProgressStyle(ProgressDialog.STYLE_SPINNER);
        progressDialog.setProgress(0);

        database = Room.databaseBuilder(this, AgentDatabase.class, "Agent-database.db")
                .allowMainThreadQueries()
                .build();

        agentDao = (AgentDao) database.getAgentDao().getUser();//.getUser(agentUserName, agentUserPwd);


        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LoginUser();
            }
        });

    }
        public  void LoginUser(){
            if (!emptyValidation()) {
                progressDialog.show();
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                         agentList = agentDao.getUser();  //(agentUserName, agentUserPwd);

                        if(agentList!=null){
                            Intent  loginIntent = new Intent(LoginActivity.this,JobCheckActivity.class);
                            loginIntent.putExtra("User", agentUserName);
                            startActivity(loginIntent);
                            finish();
                        }else{
                            Toast.makeText(LoginActivity.this, "Incorrect User Name or Password",
                                    Toast.LENGTH_SHORT).show();
                        }
                        progressDialog.dismiss();
                    }
                }, 1000);

            }else{
                Toast.makeText(LoginActivity.this, "Please Enter your user name & password ", Toast.LENGTH_SHORT).show();
            }
        }


    private boolean emptyValidation() {
        if (TextUtils.isEmpty(agentUserName) || TextUtils.isEmpty(agentUserPwd)) {
            return true;
        }else {
            return false;
        }
    }
}

