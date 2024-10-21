package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    private static String DEBUG_TAG = "Logs Android 1";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
    }

    private void setupUI(){
        Button buttonObriInfo = findViewById(R.id.buttonInfo);
        buttonObriInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, NextActivity.class));
            }
        });
    }

    public void launchActivity(View v) {
        startActivity(new Intent(this, NextActivity.class));
    }
    @Override
    protected void onPause() {
        super.onPause();
        Log.i(DEBUG_TAG, "Metodo de onPause()");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(DEBUG_TAG, "Metodo de onRestart()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(DEBUG_TAG, "Metodo de onResume()");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(DEBUG_TAG, "Metodo de onStart()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(DEBUG_TAG, "Metodo de onStop()");
    }

    @Override
    protected void onDestroy() {
        if (isFinishing()){
            super.onDestroy();
        }
    }
/* ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        Log.d(DEBUG_TAG,"onCreate()");
        Button buttonHola = findViewById(R.id.buttonHola);
        buttonHola.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Hola bb",Toast.LENGTH_LONG);
            }
        });

        Button buttonObriInfo = findViewById(R.id.buttonInfo);
        buttonObriInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), InfoActivity.class);
            }
        });

     */
}