package com.example.metodos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("Ciclo_Actividad", "Etapa OnCreate()");
        TextView textito1 = findViewById(R.id.textId1);
        textito1.setText("Etapa onCreate()");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("Ciclo_Actividad", "Etapa OnRestart()");

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("Ciclo_Actividad", "Etapa OnStart()");
        TextView txt1 = findViewById(R.id.textId1);
        txt1.setText("Etapa onStart()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("Ciclo_Actividad", "Etapa OnResume()");
        TextView txt1 = findViewById(R.id.textId1);
        txt1.setText("Etapa onResume()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("Ciclo_Actividad", "Etapa OnPause()");
        TextView txt1 = findViewById(R.id.textId1);
        txt1.setText("Etapa onPause()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("Ciclo_Actividad", "Etapa OnStop()");
        TextView txt1 = findViewById(R.id.textId1);
        txt1.setText("Etapa onStop()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("Ciclo_Actividad", "Etapa OnDestroy()");
    }
}