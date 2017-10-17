package com.example.android.abikar;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class start extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);

        Button btncall = (Button)findViewById(R.id.btncall);
        Button btnsms = (Button)findViewById(R.id.btnsms);


        btncall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent go_Call = new Intent(getApplicationContext(),main_home.class);
                startActivity(go_Call);
            }
        });

        btnsms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent go_sms = new Intent(getApplicationContext(),sms.class);
                startActivity(go_sms);
            }
        });
    }
}
