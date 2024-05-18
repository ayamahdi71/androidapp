package com.example.ok.jbka;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class anytransportpage extends AppCompatActivity {
    ListView ls;

    ArrayAdapter<String> adapter;
    String[] Items = {"TRAIN", "Taxi","Microbus"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.anytransportpage);
        ls = (ListView) findViewById(R.id.listview);
        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, Items);
        ls.setAdapter(adapter);
        ls.setOnItemClickListener(new AdapterView.OnItemClickListener() {


            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent1 = new Intent(anytransportpage.this, transportinfo.class);
                startActivity(intent1);
            }
        });}

    public void DO(View view) {
        Intent intent = new Intent(anytransportpage.this,transportinfo.class);
        startActivity(intent);
    }


}



