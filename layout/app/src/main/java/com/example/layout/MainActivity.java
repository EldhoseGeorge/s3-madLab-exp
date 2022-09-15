package com.example.layout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void loadweb(View view) {

        Intent intent = new Intent(this, act1.class);
        startActivity(intent);

    }

    public void LLV(View view ){
        Intent intent = new Intent(this, LLV.class);
        startActivity(intent);


    }

    public void viewTable(View view ){
        Intent intent=new Intent(this,table.class);
    }

}