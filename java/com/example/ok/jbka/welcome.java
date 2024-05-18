package com.example.ok.jbka;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class welcome extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.welcome);
    }
    public  void  DO(View view)
    {
        Intent intent= new Intent(welcome.this,searchpage.class);
        startActivity(intent);
    }

}
