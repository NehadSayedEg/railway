package com.extenddev.railway.pcm.UI;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.extenddev.railway.pcm.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {
    @BindView(R.id.syncBtn)
    Button syncBtn;
    @BindView(R.id.loginBtn)
    Button loginBtn;
    @BindView(R.id.exitBtn)
    Button exitBtn;

    // Button syncBtn , exitBtn , loginBtn ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        syncBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent syncIntent = new Intent(MainActivity.this, SyncActivity.class);
                startActivity(syncIntent);

            }
        });

        exitBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent homeScreenIntent = new Intent(Intent.ACTION_MAIN);
                homeScreenIntent.addCategory(Intent.CATEGORY_HOME);
                homeScreenIntent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(homeScreenIntent);

            }
        });


        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent loginInIntent = new Intent(MainActivity.this, LoginActivity.class);
                 startActivity(loginInIntent);
            }
        });
    }
}
