package com.example.administrator.androidmatrialdesignproject;

import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;

public class TextInputLayoutActivity extends AppCompatActivity {

    private TextInputLayout textInputPasswd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text_input_layout);
        textInputPasswd = (TextInputLayout) findViewById(R.id.textInputPassword);
        final EditText editTextPasswd = textInputPasswd.getEditText();
        editTextPasswd.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                if (s.length() > 20) {
                    textInputPasswd.setErrorEnabled(true);
                    textInputPasswd.setError("您的输入有误");
                } else {
                    textInputPasswd.setErrorEnabled(false);
                }
            }
        });
    }
}
