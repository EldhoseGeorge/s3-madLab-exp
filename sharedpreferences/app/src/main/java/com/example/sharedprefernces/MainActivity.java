package com.example.sharedprefernces;

import androidx.appcompat.app.AppCompatActivity;


import android.content.SharedPreferences;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity<sharedPreferences> extends AppCompatActivity {
    SharedPreferences sharedprf;
    EditText name,age,phone;
    public static final String pref="pref";
    public static final String ageKey="age";
    public static final String nameKey="name";
    public static final String PhoneKey="Phone";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name=(EditText) findViewById(R.id.idName);
        age=(EditText) findViewById(R.id.idAge);
        phone=(EditText) findViewById(R.id.editTextPhone);
        sharedprf=getSharedPreferences(pref,0);
        if(sharedprf.contains(nameKey))
            name.setText(sharedprf.getString(nameKey,"error"));
        if(sharedprf.contains(ageKey))
            age.setText(sharedprf.getString(ageKey,"error"));
        if(sharedprf.contains(PhoneKey))
            phone.setText(sharedprf.getString(PhoneKey,"error"));
    }

    public void save(View view){
        name=(EditText) findViewById(R.id.idName);
        age=(EditText) findViewById(R.id.idAge);
        phone=(EditText) findViewById(R.id.editTextPhone);
        String NAME=name.getText().toString();
        String AGE=age.getText().toString();
        String PHONE=phone.getText().toString();
        SharedPreferences.Editor edit=sharedprf.edit();
        edit.putString(nameKey,NAME);
        edit.putString(ageKey,AGE);
        edit.putString(PhoneKey,PHONE);
        edit.commit();
    }

    public void retreive(View view){
        name=(EditText) findViewById(R.id.idName);
        age=(EditText) findViewById(R.id.idAge);
        phone=(EditText) findViewById(R.id.editTextPhone);
        sharedprf=getSharedPreferences(pref,0);
        if(sharedprf.contains(nameKey))
            name.setText(sharedprf.getString(nameKey,"error"));
        if(sharedprf.contains(ageKey))
            age.setText(sharedprf.getString(ageKey,"error"));
        if(sharedprf.contains(PhoneKey))
            phone.setText(sharedprf.getString(PhoneKey,"error"));

    }
    public void clear(View view){
        name=(EditText) findViewById(R.id.idName);
        age=(EditText) findViewById(R.id.idAge);
        phone=(EditText) findViewById(R.id.editTextPhone);
        name.setText("");
        age.setText("");
        phone.setText("");
    }

}