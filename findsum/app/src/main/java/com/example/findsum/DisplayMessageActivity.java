package com.example.findsum;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class DisplayMessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);
        Intent intent= getIntent();
        String msg="woo woo you won ";
        TextView t1= findViewById(R.id.answerview);
        int ans=intent.getIntExtra("ans",0);
        int num1=intent.getIntExtra("num1",0);
        int num2=intent.getIntExtra("num2",0);

        if(num1+num2!=ans)
            msg="oops ! try again";

        t1.setText(msg);


    }
}