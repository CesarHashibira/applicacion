package com.cesar.f1store

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity

class SplashActivity : AppCompatActivity() {
    private val SPLASH_TIME_OUT: Long = 3000 // Duración del splash screen en milisegundos

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        // Simulamos algún proceso de inicialización aquí (por ejemplo, cargar datos, inicializar servicios, etc.)
        // Esto podría ser reemplazado por el proceso de inicialización real de tu aplicación

        // Simulamos un retraso para mostrar el splash screen
        Handler().postDelayed({
            // Después del tiempo de duración, iniciamos la actividad de inicio de sesión
            startActivity(Intent(this, LoginActivity::class.java))

            // Cerramos esta actividad para evitar que el usuario regrese al splash screen presionando el botón Atrás
            finish()
        }, SPLASH_TIME_OUT)
    }
}
