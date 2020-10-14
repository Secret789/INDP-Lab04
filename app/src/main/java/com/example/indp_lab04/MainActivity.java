package com.example.indp_lab04;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    Button button1;
    AdapterList adapter;
    ListView listview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listview = (ListView) findViewById(R.id.listview);
        ArrayList<Estudiante> estudiantes = new ArrayList<Estudiante>();
        estudiantes.add(new Estudiante(20170632,"Javier Stuart","Casas Mendoza"));
        estudiantes.add(new Estudiante(20170632,"Carlos Luis","Garcia Diaz"));
        estudiantes.add(new Estudiante(20170632,"George Pedro","Matinez del Rio"));


        adapter = new AdapterList(this, R.layout.custom_text_list, estudiantes);
        listview.setAdapter(adapter);

        button1=(Button)findViewById(R.id.button1);
        button1.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View arg0) {
                Intent intent=new Intent(MainActivity.this,AddActivity.class);
                startActivityForResult(intent, 2);// Activity is started with requestCode 2
            }
        });

    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data)
    {
        super.onActivityResult(requestCode, resultCode, data);
        // check if the request code is same as what is passed  here it is 2
        if(requestCode==2)
        {
            String message=data.getStringExtra("MESSAGE");
            adapter.estudiantes.add(new Estudiante(20170632,"George Pedro","Matinez del Rio"));
            Log.d("CREATED",Integer.toString(adapter.getCount()));
            listview.setAdapter(adapter);
        }
    }

}