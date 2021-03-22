package mx.edu.itl.c17130801.u2banderitaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void UnActivityUnLayoutClick ( View v ) {
        // Invocamos la ejecución del Activity BanderaCompleta
        Intent intent = new Intent ( this, BanderaCompletaActivity.class );
        startActivity( intent );
    }

    public void UnActivityTresLayoutsClick ( View v ) {
        // Invocar la ejecución del activity BanderaTresLayoutActivity
        Intent intent = new Intent ( this, BanderaTresLayoutsActivity.class );
        startActivity ( intent );
    }

    public void btnTresActivityTresLayoutsClick ( View v ) {
        // Invocar la ejecución del activity VerdeActivity
        Intent intent = new Intent ( this, VerdeActivity.class );
        startActivity ( intent );
    }

    public void AcercaDeClick ( View v ) {
        // Invocar la ejecución de la portada
        Intent intent = new Intent ( this, AcercaDeActivity.class );
        startActivity( intent );
    }
}