package com.example.ok.jbka;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class hosp extends AppCompatActivity {
    ListView lst;

    ArrayAdapter<String> ladapter;
    String[] Items = {"EL GAMAA", "EL AHRAR","SEDNAWY","AL OBOUR","EL MABARA ","EL TAYSER"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hosp);
        lst = (ListView) findViewById(R.id.listview);
        ladapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, Items);
        lst.setAdapter(ladapter);
        lst.setOnItemClickListener(new AdapterView.OnItemClickListener() {


            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(id==0)
                {
                    Intent intent1 = new Intent(hosp.this,elgamaa.class);
                    startActivity(intent1);
                }
                else if(id==1)
                { Intent intent1 = new Intent(hosp.this,elahrar.class);
                    startActivity(intent1);}
                else
                if(id==2)
                {
                    Intent intent1 = new Intent(hosp.this,sednawy.class);
                    startActivity(intent1);
                }
                else
                if(id==3)
                {
                    Intent intent1 = new Intent(hosp.this,elobour.class);
                    startActivity(intent1);
                }
                else
                if(id==4)
                {
                    Intent intent1 = new Intent(hosp.this,elmabara.class);
                    startActivity(intent1);
                }
                else
                if(id==5)
                {
                    Intent intent1 = new Intent(hosp.this,eltayser.class);
                    startActivity(intent1);
                }
            }
        });}

}

