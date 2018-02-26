package com.example.anil.intent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText edit1,edit2;
    Button btn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edit1=(EditText) findViewById(R.id.ed1);
        edit2=(EditText) findViewById(R.id.ed2);

    }
    public void display(View view)
    {
        String s1=edit1.getText().toString(),s2=edit2.getText().toString();
        if(s1.equals(s2))
        {
            Intent i= new Intent(this,Main2Activity.class);
            i.putExtra("username",s1);
            startActivity(i);


        }else
        {
            Toast.makeText(this, "login failed", Toast.LENGTH_SHORT).show();
        }


    }
}
