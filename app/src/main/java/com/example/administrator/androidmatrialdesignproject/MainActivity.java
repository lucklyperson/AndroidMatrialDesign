package com.example.administrator.androidmatrialdesignproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.text.Layout;
import android.util.Log;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button btnAppBarLayout;
    private Button btnCoordinator;
    private Button btnTextInput;
    private Button btnTableLayout;
    private Button btnCollapsingToolbar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initToolbar();
        initView();
        setListener();
    }

    private void initView() {
        btnAppBarLayout = (Button) findViewById(R.id.btn_appBar);
        btnCoordinator = (Button) findViewById(R.id.btn_Coordinator);
        btnTextInput = (Button) findViewById(R.id.btn_TextInput);
        btnTableLayout = (Button) findViewById(R.id.btn_tableLayout);
        btnCollapsingToolbar = (Button) findViewById(R.id.btn_CollapsingToolbar);
    }

    private void initToolbar() {
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle("AndroidMaterialDesign");
        toolbar.setNavigationIcon(R.drawable.ic_menu_black_24dp);
        setSupportActionBar(toolbar);
    }


    private void setListener() {
        btnAppBarLayout.setOnClickListener(this);
        btnCoordinator.setOnClickListener(this);
        btnTextInput.setOnClickListener(this);
        btnTableLayout.setOnClickListener(this);
        btnCollapsingToolbar.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_appBar:
                Intent intent_1 = new Intent(this, AppBarLayoutActivity.class);
                startActivity(intent_1);
                break;
            case R.id.btn_Coordinator:
                Intent intent_2 = new Intent(this, CoordinatorActivity.class);
                startActivity(intent_2);
                break;
            case R.id.btn_TextInput:
                Intent intent3 = new Intent(this, TextInputLayoutActivity.class);
                startActivity(intent3);
                break;
            case R.id.btn_tableLayout:
                Intent intent4 = new Intent(this, TableLayoutActivity.class);
                startActivity(intent4);
                break;
            case R.id.btn_CollapsingToolbar:
                Intent intent5 = new Intent(this, CollaspingToolbarActivity.class);
                startActivity(intent5);
                break;
            default:
                break;
        }
    }
}
