package com.extenddev.railway.pcm.UI;

import android.inputmethodservice.ExtractEditText;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatSpinner;

import com.extenddev.railway.pcm.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class CashFundsDeviceIDActivity extends AppCompatActivity {

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
    @BindView(R.id.deviceIDTextview)
    TextView deviceIDTextview;
    @BindView(R.id.deviceIDEditText)
    ExtractEditText deviceIDEditText;
    @BindView(R.id.cashFundsTextView)
    TextView cashFundsTextView;
    @BindView(R.id.cashFundsEditText)
    ExtractEditText cashFundsEditText;
    @BindView(R.id.notesTextView)
    TextView notesTextView;
    @BindView(R.id.notesEditText)
    ExtractEditText notesEditText;
    @BindView(R.id.confirmBtn)
    Button confirmBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cash_funds_device_id);
        ButterKnife.bind(this);

        jobSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }
}
