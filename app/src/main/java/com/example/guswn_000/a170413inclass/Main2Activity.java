package com.example.guswn_000.a170413inclass;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

import java.util.ArrayList;

public class Main2Activity extends AppCompatActivity {
    ArrayList<RestInfo> data = new ArrayList<>();
    ListView listView;
    RestAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        listView = (ListView)findViewById(R.id.list1);
        data.add(new RestInfo("BBQ","01051856909",0));
        data.add(new RestInfo("Mengkkimon","01051856909",0));
        data.add(new RestInfo("Namjuice","01051856909",1));
        data.add(new RestInfo("DDANGicecream","01051856909",2));

        adapter = new RestAdapter(this,data);
        listView.setAdapter(adapter);
    }
    public void onClick(View v)
    {
        if(v.getId() == R.id.b1)
        {
            adapter.setsort(RestAdapter.NAME_ASC);
        }
    }
}
