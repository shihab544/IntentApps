package com.example.intentapps;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button explicit_btn1,implicit_btn1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        explicit_btn1 = (Button) findViewById(R.id.explicit_btn1);
        implicit_btn1 = (Button) findViewById(R.id.implicit_btn1);
        Toast.makeText(getApplicationContext(),"Welcome to MainActivity",Toast.LENGTH_SHORT).show();

        //implement Onclick event for Explicit Intent

        explicit_btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentsk = new Intent(getApplicationContext()
                        ,Activity2.class);
                startActivity(intentsk);
            }
        });

        //implement onClick event for Implicit Intent

        implicit_btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentObj = new Intent(Intent.ACTION_VIEW);
                intentObj.setData(Uri.parse("https://abhiandroid.com/programming/intent-in-android"));
                startActivity(intentObj);
            }
        });


    }


   //For menu exit bar
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.exit){
            AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
            builder.setMessage("Do you wnat to Exit ?");
            builder.setCancelable(true);

            builder.setNegativeButton("Yes", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    finish();
                }
            });

            builder.setPositiveButton("No", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    dialog.cancel();
                }
            });
            AlertDialog alertDialog = builder.create();
            alertDialog.show();
        }
        return true;
    }
}
