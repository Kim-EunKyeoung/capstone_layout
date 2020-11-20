package com.example.capstone_layout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btn_abs, btn_algo, btn_prgm;
    private Intent intent_1;
    private Intent intent_2;
    private Intent intent_3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_abs = findViewById(R.id.btn_abstract);
        btn_abs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent_1 =  new Intent(getApplicationContext(), subsection_abstract.class);
                startActivity(intent_1);
            }
        });
        btn_algo = findViewById(R.id.btn_algorithm);
        btn_algo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent_2 = new Intent(getApplicationContext(), subsection_algorithm.class);
                startActivity(intent_2);
            }
        });
        btn_prgm = findViewById(R.id.btn_programming);
        btn_prgm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent_3 = new Intent(getApplicationContext(), subsection_programming.class);
                startActivity(intent_3);
            }
        });
    }

}
