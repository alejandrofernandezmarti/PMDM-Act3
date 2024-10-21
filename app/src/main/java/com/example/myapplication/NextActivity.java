package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class NextActivity extends AppCompatActivity {

    private static String DEBUG_TAG = "Logs Android 2";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_next);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
    public void launchActivity(View v) {
        startActivity(new Intent(this, MainActivity.class));
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
}