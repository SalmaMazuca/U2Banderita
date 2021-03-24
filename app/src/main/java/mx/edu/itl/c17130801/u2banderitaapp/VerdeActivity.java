package mx.edu.itl.c17130801.u2banderitaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class VerdeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView ( R.layout.activity_verde );
    }

    public void cambiarSeccion ( View v ) {
        if ( v.getId () == R.id.btnVerdeSiguiente ) {
            // Invocar al activity de la sección blanco de la bandera
            Intent intent = new Intent ( this, BlancoActivity.class );
            startActivity ( intent );
        } else if ( v.getId () == R.id.btnVerdeAtras ) {
            // Finalizamos la ejecución de este activity
            finish ();
        }
    }
}