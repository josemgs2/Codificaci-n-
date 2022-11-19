package com.android.cristiangallego.reportados.vistas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.android.cristiangallego.reportados.R;

public class NuevoReporte extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nuevo_reporte);
    }

    public void accionListaReportes(View v)
    {
        startActivity(new Intent(this, MisReportes.class));
    }
}
