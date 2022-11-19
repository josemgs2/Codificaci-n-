package com.android.cristiangallego.reportados.vistas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.android.cristiangallego.reportados.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void accionReportesCercanos(View view)    {
        startActivity(new Intent(this, ReportesCercanosPreview.class));
    }

    public void accionRegistro(View view)    {
        startActivity(new Intent(this, RegistroUsuario.class));
    }
}
