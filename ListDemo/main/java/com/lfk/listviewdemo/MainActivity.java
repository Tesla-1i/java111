package com.lfk.listviewdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView listView = (ListView)findViewById(R.id.listview);

        ArrayList<ListInfo> arrayList = new ArrayList<>();

        for(int i = 0;i < 10;i++){
            arrayList.add(new ListInfo(R.mipmap.ic_launcher,"蛤蛤蛤蛤",true));
            arrayList.add(new ListInfo(R.mipmap.ic_launcher,"蛤蛤",false));
        }

        ListAdapter adapter = new ListAdapter(this,arrayList);

        listView.setAdapter(adapter);                   
    }
}
