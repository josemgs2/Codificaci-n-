package com.android.cristiangallego.reportados.vistas;

import android.app.Activity;
import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.android.cristiangallego.reportados.R;

public class ReportesCercanosPreview extends AppCompatActivity {

    private FloatingActionButton fabNuevoReporte;
    private Activity actividad;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reportes_cercanos_preview);
        this.fabNuevoReporte = findViewById(R.id.fabCamera);
        this.actividad = this;
        this.fabNuevoReporte.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(actividad, NuevoReporte.class));
            }
        });
    }
}
