package com.example.examenpractico;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActionBar;
import android.app.ApplicationExitInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
        getSupportActionBar().setCustomView(R.layout.cerrar);

        ImageButton btncerrar = findViewById(R.id.btncerrar);
        btncerrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        Button btnreserva = findViewById(R.id.btnreserva);
        btnreserva.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplication(), "Hola Mundo", Toast.LENGTH_SHORT).show();
            }
        });
    }
}