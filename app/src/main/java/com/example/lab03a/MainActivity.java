package com.example.lab03a;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this, "OnCreate Main", Toast.LENGTH_SHORT).show();
        //La actividad esta creada.
        Button btnMySaludo=(Button) findViewById(R.id.btnSaludo);
        btnMySaludo.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(),SaludoActivity.class);
                startActivity(intent);

            }
        });
    }
    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this, "OnStart Main", Toast.LENGTH_SHORT).show();
        //La actividad esta a punto  de hacerse visible.
    }
    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this, "OnResume Main", Toast.LENGTH_SHORT).show();
        //La actividad se ha vuelto visible(ahora se reanuda).
    }
    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this, "OnPause Main", Toast.LENGTH_SHORT).show();
        //Enfocarse en otra actividad (esta actividad esta a punto de ser detenida).
    }
    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this, "OnStop Main", Toast.LENGTH_SHORT).show();
        //La actividad ya no es visible (ahora esta detenida).
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this, "OnDestroy Main", Toast.LENGTH_SHORT).show();
        //La actividad esta a punto de ser destruida.
    }
}