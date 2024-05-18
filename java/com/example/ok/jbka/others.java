package com.example.ok.jbka;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class others extends AppCompatActivity {
    ListView ls1;

    ArrayAdapter<String> adapter;
    String[] Items = {"Hospitals", "Resturants","Malls","Police centers","Hotels","Post offices"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.others);
        ls1 = (ListView) findViewById(R.id.listview1);
        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, Items);
        ls1.setAdapter(adapter);
        ls1.setOnItemClickListener(new AdapterView.OnItemClickListener() {


            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(id==0)
                {
                    Intent intent1 = new Intent(others.this,hosp.class);
                    startActivity(intent1);
                }
                 else if(id==1)
                { Intent intent1 = new Intent(others.this,rest.class);
                startActivity(intent1);}
                else
                    if(id==2)
                    {
                        Intent intent1 = new Intent(others.this,malls.class);
                        startActivity(intent1);
                    }
                    else
                    if(id==3)
                    {
                        Intent intent1 = new Intent(others.this,pol.class);
                        startActivity(intent1);
                    }
                    else
                    if(id==4)
                    {
                        Intent intent1 = new Intent(others.this,hotels.class);
                        startActivity(intent1);
                    }
                    else
                    if(id==5)
                    {
                        Intent intent1 = new Intent(others.this,postoffice.class);
                        startActivity(intent1);
                    }
            }
        });}

}

