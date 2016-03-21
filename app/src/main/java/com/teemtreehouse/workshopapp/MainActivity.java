package com.teemtreehouse.workshopapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.parse.ParseObject;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button coolButton = (Button) findViewById(R.id.button);
        coolButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, R.string.special_text, Toast.LENGTH_LONG).show();
            }
        });

        Treehouse temp = new Treehouse();

        ParseObject object;
    }
}
