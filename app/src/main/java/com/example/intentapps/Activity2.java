package com.example.intentapps;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Activity2 extends AppCompatActivity {
    Button explicit_btn2,implicit_btn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        Toast.makeText(getApplicationContext(),"We are move to second Activity",Toast.LENGTH_SHORT).show();

        explicit_btn2 = (Button) findViewById(R.id.explicit_btn2);
        implicit_btn2= (Button) findViewById(R.id.implicit_btn2);

        explicit_btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentsk = new Intent (getApplicationContext()
                        ,Activity3.class);
                startActivity(intentsk);
            }
        });

        implicit_btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentObj = new Intent(Intent.ACTION_VIEW);
                intentObj.setData(Uri.parse("https://www.javatpoint.com/android-intent-tutorial"));
                startActivity(intentObj);

            }
        });
    }
}