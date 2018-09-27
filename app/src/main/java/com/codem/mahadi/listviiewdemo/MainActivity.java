package com.codem.mahadi.listviiewdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView myListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myListView = (ListView) findViewById(R.id.myListVive);

        final ArrayList<String> myFamily = new ArrayList<String>();

        myFamily.add("Mahadi");
        myFamily.add("Fulmiya");
        myFamily.add("Shahana");
        myFamily.add("Bipasha");
        myFamily.add("Arcel");
        myFamily.add("Anika");

        ArrayAdapter<String> myAdapter = new ArrayAdapter<String>(this, R.layout.list_view, R.id.name, myFamily);

        myListView.setAdapter(myAdapter);

        myListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                Toast.makeText(getApplicationContext(), myFamily.get(i), Toast.LENGTH_LONG).show();
            }
        });
    }
}
