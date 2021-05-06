package com.example.aplicao;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText Conv;
    Button bt_converter;
    TextView tvc_tempF;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Conv=findViewById(R.id.Conv);
        bt_converter=findViewById(R.id.bt_converter);
        tvc_tempF=findViewById(R.id.text_resultado);
        bt_converter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
             double tempC=   Double.parseDouble(Conv.getText().toString());
             double tempF= tempC * 1.8 + 32;
                tvc_tempF.setText("A temperatura em Fahreineit: " + tempF);
            }
        });


}
    }