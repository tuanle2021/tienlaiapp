package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button btnKetqua;
    EditText txtTiengui;
    EditText txtLaisuat;
    EditText txtKihan;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //gán
        txtTiengui = (EditText)findViewById(R.id.txtTiengui);
        txtLaisuat = (EditText)findViewById(R.id.txtLaisuat);
        txtKihan = (EditText)findViewById(R.id.txtKihan);
        btnKetqua =(Button)findViewById(R.id.btbKetqua);
        btnKetqua.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new  Intent(MainActivity.this, KetquaActivity.class);
                startActivity(intent);
            }
        });
    }
}