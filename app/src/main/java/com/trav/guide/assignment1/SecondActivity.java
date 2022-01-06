package com.trav.guide.assignment1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class SecondActivity extends AppCompatActivity {
    private EditText edtName,edtEMail,edtRoll;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_second );
        edtName=(EditText) findViewById( R.id.edtNameSecond );
        edtEMail=(EditText) findViewById( R.id.edtEmailSecond );
        edtRoll=(EditText) findViewById( R.id.edtRollSecond );
        Intent it=getIntent();
        String name,email,roll;
        name=it.getStringExtra( "name" );
        email=it.getStringExtra( "email" );
        roll=it.getStringExtra( "roll" );
        edtEMail.setText( email+" " );
        edtRoll.setText( roll+" " );
        edtName.setText( name+" " );

    }
}