package com.example.karyacom;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class description1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_description1);
       findViewById(R.id.btndescription1).setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               //startActivity(new Intent(description1.this,Location.class));
           }
       });

    }
}
