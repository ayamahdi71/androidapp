package com.example.ok.jbka;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class transportinfo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.transportinfo);
    }
    public  void clk(View view)
    {
        Intent intent=new Intent(transportinfo.this,MapsActivity.class);
        startActivity(intent);
    }
}
