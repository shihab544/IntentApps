package com.example.intentapps;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Activity3 extends AppCompatActivity {
    Button explicit_btn3,implicit_btn3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);
        Toast.makeText(getApplicationContext(),"We are move to third Activity",Toast.LENGTH_SHORT).show();

        explicit_btn3 = (Button) findViewById(R.id.explicit_btn3);
        implicit_btn3 = (Button) findViewById(R.id.implicit_btn3);

        //implimation explicit intent
        explicit_btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentsk = new Intent(getApplicationContext()
                ,Activity4.class);
                startActivity(intentsk);
            }
        });

        //implimation implicint intent

        implicit_btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentObj = new Intent(Intent.ACTION_VIEW);
                intentObj.setData(Uri.parse("https://www.youtube.com/channel/UCqQkbRgqJbvtcK9EkxEfzpA/featured"));

            }
        });
    }
}