package com.example.administrator.androidmatrialdesignproject;

import android.support.design.widget.TabLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class TableLayoutActivity extends AppCompatActivity {
    private TabLayout tableLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_table_layout);
        tableLayout = (TabLayout) findViewById(R.id.tableLayout);
        tableLayout.addTab(tableLayout.newTab().setText("选项1"));
        tableLayout.addTab(tableLayout.newTab().setText("选项2"));
        tableLayout.addTab(tableLayout.newTab().setText("选项3"));
        tableLayout.addTab(tableLayout.newTab().setText("选项4"));
        tableLayout.addTab(tableLayout.newTab().setText("选项5"));
        tableLayout.addTab(tableLayout.newTab().setText("选项6"));
        tableLayout.addTab(tableLayout.newTab().setText("选项7"));
        tableLayout.addTab(tableLayout.newTab().setText("选项8"));
        tableLayout.addTab(tableLayout.newTab().setText("选项9"));
        tableLayout.addTab(tableLayout.newTab().setText("选项10"));
        tableLayout.addTab(tableLayout.newTab().setText("选项11"));

        tableLayout.addTab(tableLayout.newTab().setText("add"), 6);
    }
}
