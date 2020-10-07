package com.example.lab03a;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class SaludoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_saludo);
        Toast.makeText(this, "OnCreate Saludo", Toast.LENGTH_SHORT).show();
        //La actividad esta creada.
    }
    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this, "OnStart Saludo", Toast.LENGTH_SHORT).show();
        //La actividad esta a punto  de hacerse visible.
    }
    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this, "OnResume Saludo", Toast.LENGTH_SHORT).show();
        //La actividad se ha vuelto visible(ahora se reanuda).
    }
    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this, "OnPause Saludo", Toast.LENGTH_SHORT).show();
        //Enfocarse en otra actividad (esta actividad esta a punto de ser detenida).
    }
    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this, "OnStop Saludo", Toast.LENGTH_SHORT).show();
        //La actividad ya no es visible (ahora esta detenida).
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this, "OnDestroy Saludo", Toast.LENGTH_SHORT).show();
        //La actividad esta a punto de ser destruida.
    }
}