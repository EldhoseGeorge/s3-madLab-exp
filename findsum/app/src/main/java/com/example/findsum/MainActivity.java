package com.example.findsum;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;
public class MainActivity extends AppCompatActivity {

    int num1,num2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Random r= new Random();
        num1=r.nextInt(1000);
        num2=r.nextInt(7000);
        TextView t1= (TextView)findViewById(R.id.textView2);
        String msg=num1+"+"+num2;
        t1.setText(msg);
    }
    public void checkResult(View view ){
        Intent intent = new Intent(this,DisplayMessageActivity.class);
        EditText e1= (EditText)findViewById(R.id.ans);
        int answer=Integer.parseInt(e1.getText().toString());
        intent.putExtra("ans",answer);
        intent.putExtra("num1",num1);
        intent.putExtra("num2",num2);

        startActivity(intent);

    }


}