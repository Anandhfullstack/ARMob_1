package com.example.armob;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;


public class Gender extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gender);
        ImageButton male=(ImageButton) findViewById(R.id.btn_male);
       male.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View a) {
                Intent i=new Intent(Gender.this,camera_activity.class);
                startActivity(i);


            }

        });
    }



}
