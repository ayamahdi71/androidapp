package com.example.ok.jbka;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

import java.io.InputStream;

public class searchpage extends AppCompatActivity {
    String destination;
    String spinn1;
    String spinn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.searchpage);
        final EditText des=(EditText) findViewById(R.id.editText);

        Button search=(Button) findViewById(R.id.srchbtn);
        search.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent=new Intent(searchpage.this,);
                // TODO Auto-generated method stub
Spinner spinn1=(Spinner)findViewById(R.id.spinner);
                spinn1.getSelectedItem().toString();
                Spinner spinn2=(Spinner)findViewById(R.id.spinner2);
                spinn2.getSelectedItem().toString();
                destination=des.getText().toString();

            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inf=getMenuInflater();
        inf.inflate(R.menu.main_menu,menu);
        return super.onCreateOptionsMenu(menu);

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId())
        {
            case R.id.item1 :{
                Intent intent=new Intent(searchpage.this,help.class);
                startActivity(intent);
                break;
            }
            case R.id.item2 :{

                Intent intent=new Intent(searchpage.this,others.class);
                startActivity(intent);

            }
        }
        return super.onOptionsItemSelected(item);
    }
}

