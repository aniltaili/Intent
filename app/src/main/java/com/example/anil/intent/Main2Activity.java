package com.example.anil.intent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {
TextView t;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent i1= getIntent();
        Bundle b=i1.getExtras();
        String name=b.getString("username");

        TextView t=(TextView)findViewById(R.id.txt);

        Toast.makeText(this, "wlcome user"+name, Toast.LENGTH_SHORT).show();
    }
}
