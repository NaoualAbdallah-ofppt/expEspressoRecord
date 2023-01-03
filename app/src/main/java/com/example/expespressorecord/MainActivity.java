package com.example.expespressorecord;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnGo= findViewById(R.id.btn_go);
        TextView txtResult= (TextView) findViewById(R.id.txt_result);
        EditText editLogin =(EditText) findViewById(R.id.edit_login);
        EditText editPassword = (EditText) findViewById(R.id.edit_password);
        btnGo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (editLogin.getText().toString().equals("test")
                        && editPassword.getText().toString().equals("123"))
                {
                    txtResult.setText("OK");
                } else {
                    txtResult.setText("KO");
                }
            }
        });

    }
}