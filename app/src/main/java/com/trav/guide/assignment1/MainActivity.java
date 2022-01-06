package com.trav.guide.assignment1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText edtName,edtEMail,edtRoll;
    private Button btnSubmit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );

        edtName=(EditText) findViewById( R.id.edtName );
        edtEMail=(EditText) findViewById( R.id.edtEmail );
        edtRoll=(EditText) findViewById( R.id.edtRoll );
        btnSubmit=(Button) findViewById( R.id.btnSubmit );
        btnSubmit.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it=new Intent(MainActivity.this, SecondActivity.class);
                if (!TextUtils.isEmpty( edtName.getText() ) && !TextUtils.isEmpty( edtEMail.getText() ) && TextUtils.isEmpty( edtRoll.getText() )){

                }else {
                    it.putExtra( "name",edtName.getText()+" " );
                    it.putExtra( "email",edtEMail.getText()+" " );
                    it.putExtra( "roll",edtRoll.getText()+" " );
                    startActivity( it );
                }
            }
        } );
    }
}