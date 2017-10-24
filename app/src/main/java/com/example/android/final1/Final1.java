package com.example.android.final1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.app.Activity;
import android.view.MenuItem;
import android.widget.EditText;
import android.util.Log;

public class Final1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final1);

            Button button1=(Button) findViewById(R.id.b1);
            button1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent1 = new Intent(Final1.this,activity1.class);
                    startActivity(intent1);
                }
            });

            Button button2=(Button) findViewById(R.id.b2);
            button2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                Intent intent2 = new Intent(Final1.this,activity2.class);
                startActivity(intent2);
                }
            });
        }
    }

