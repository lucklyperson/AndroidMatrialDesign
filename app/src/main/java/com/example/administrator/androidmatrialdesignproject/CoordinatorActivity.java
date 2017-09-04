package com.example.administrator.androidmatrialdesignproject;

import android.support.design.widget.TabLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class CoordinatorActivity extends AppCompatActivity {

    private TabLayout tabLayout;
  //  private ListView lv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coordinator);
        tabLayout = (TabLayout) findViewById(R.id.tableLayout);
       // lv = (ListView) findViewById(R.id.lv);
        tabLayout.addTab(tabLayout.newTab().setText("选项1"));
        tabLayout.addTab(tabLayout.newTab().setText("选项2"));
        tabLayout.addTab(tabLayout.newTab().setText("选项3"));
        List<String> data = new ArrayList<>();
        for (int i = 0; i <= 20; i++) {
            data.add(String.valueOf(i));
        }
        BaseAdapter adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, data);
      //  lv.setAdapter(adapter);
    }
}
