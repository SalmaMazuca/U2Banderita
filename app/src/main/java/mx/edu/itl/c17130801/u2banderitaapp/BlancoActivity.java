package mx.edu.itl.c17130801.u2banderitaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class BlancoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView ( R.layout.activity_blanco );
    }

    public void cambiarSeccion ( View v ) {
        if ( v.getId () == R.id.btnBlancoSiguiente ) {
            // Invocar al activity de la sección rojo de la bandera
            Intent intent = new Intent ( this, RojoActivity.class );
            startActivity ( intent );
        } else if ( v.getId () == R.id.btnBlancoAtras ) {
            // Finalizamos la ejecución de este activity
            finish ();
        }
    }
}