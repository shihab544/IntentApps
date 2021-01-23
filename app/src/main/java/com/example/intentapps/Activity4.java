package com.example.intentapps;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Activity4 extends AppCompatActivity {
    Button mainActivity_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_4);
        mainActivity_btn = (Button) findViewById(R.id.mainActivity_btn);


        Toast.makeText(getApplicationContext(),"We move to fourth Activiy",Toast.LENGTH_SHORT).show();


        mainActivity_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext()
                ,MainActivity.class);
                startActivity(intent);
            }
        });

    }
}