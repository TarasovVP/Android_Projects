package com.gmail.tarasov1998.p0121_logandmess;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private static final String TAG = "myLogs";
    TextView tvOut;
    Button btnOk;
    Button btnCancel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d(TAG, "найдем View-элементы");
        tvOut = (TextView) findViewById(R.id.tvOut);
        btnOk = (Button) findViewById(R.id.btnOk);
        btnCancel = (Button) findViewById(R.id.btnCancel);

        Log.d(TAG, "присваиваем обработчик кнопкам");
        btnOk.setOnClickListener(this);
        btnCancel.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {
        Log.d(TAG, "по id определяем кнопку, вызвавшую этот обработчик");
        switch (v.getId()) {
            case R.id.btnOk:
                Log.d(TAG, "кнопка ОК");
                tvOut.setText("It was pressed \"OK\"");
                Toast.makeText(this, "Нажата кнопка ОК", Toast.LENGTH_LONG).show();
                break;
            case R.id.btnCancel:
                Log.d(TAG, "кнопка Cancel");
                tvOut.setText("It was pressed \"Cancel\"");
                break;
        }
    }
}
