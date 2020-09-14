package com.example.latinput_customlistview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText bilangan;
    private EditText bilangan2;
    private EditText hasil;
    private Button btnHasil;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initUI();
        initEvent();
    }

    private void initUI(){
        bilangan = (EditText)findViewById(R.id.bilangan);
        bilangan2 = (EditText)findViewById(R.id.bilangan2);
        hasil = (EditText)findViewById(R.id.hasil);
        btnHasil = (Button)findViewById(R.id.btnHasil);
    }

    private void initEvent(){
        btnHasil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hitungJumlah();
            }
        });
    }

    private void hitungJumlah(){
        int angka1 = Integer.parseInt(bilangan.getText().toString());
        int angka2 = Integer.parseInt(bilangan2.getText().toString());
        int total = angka1 + angka2;
        hasil.setText(total+"");
    }
}
