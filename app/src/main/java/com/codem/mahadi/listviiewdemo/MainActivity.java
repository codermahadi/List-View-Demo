package com.codem.mahadi.listviiewdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView myListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myListView = (ListView) findViewById(R.id.myListVive);

        ArrayList<String> myFamily = new ArrayList<String>();

        myFamily.add("Mahadi");
        myFamily.add("Fulmiya");
        myFamily.add("Shahana");
        myFamily.add("Bipasha");
        myFamily.add("Arcel");
        myFamily.add("Anika");
        myFamily.add("Mahadi");
        myFamily.add("Fulmiya");
        myFamily.add("Shahana");
        myFamily.add("Bipasha");
        myFamily.add("Arcel");
        myFamily.add("Anika");
        myFamily.add("Mahadi");
        myFamily.add("Fulmiya");
        myFamily.add("Shahana");
        myFamily.add("Bipasha");
        myFamily.add("Arcel");
        myFamily.add("Anika");

        ArrayAdapter<String> myAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, myFamily);

        myListView.setAdapter(myAdapter);
    }
}
