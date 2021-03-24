package mx.edu.itl.c17130801.u2banderitaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        // Pasar a la pantalla principal después de 5 segundos
        new Handler ().postDelayed (new Runnable () {
            @Override
            public void run () {
                Intent intent = new Intent ( SplashActivity.this, MainActivity.class );
                startActivity ( intent );
                finish ();
            }
        }, 5000 );
     }
}