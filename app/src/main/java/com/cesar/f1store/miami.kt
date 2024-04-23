package com.cesar.f1store

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class miami : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_miami)

        // Obtener referencias a los ImageButtons
        val imageButton1 = findViewById<ImageButton>(R.id.imageButton1)
        val imageButton2 = findViewById<ImageButton>(R.id.imageButton2)
        val imageButton3 = findViewById<ImageButton>(R.id.imageButton3)

        // Agregar OnClickListener a cada ImageButton
        imageButton1.setOnClickListener {
            // Crear un Intent para ir a la nueva actividad y agregar datos adicionales
            val intent = Intent(this, hoddy::class.java).apply {
                putExtra("producto", "Hoddy Universal")
            }
            // Iniciar la nueva actividad
            startActivity(intent)
        }

        imageButton2.setOnClickListener {
            // Crear un Intent para ir a la nueva actividad y agregar datos adicionales
            val intent = Intent(this, sueterchina::class.java).apply {
                putExtra("producto", "Gorro Universal")
            }
            // Iniciar la nueva actividad
            startActivity(intent)
        }

        imageButton3.setOnClickListener {
            // Crear un Intent para ir a la nueva actividad y agregar datos adicionales
            val intent = Intent(this, camisachina::class.java).apply {
                putExtra("producto", "Camisa Universal")
            }
            // Iniciar la nueva actividad
            startActivity(intent)
        }

        // Ajuste de los insets
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.miamimenu)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }

    private fun enableEdgeToEdge() {
        // Código para habilitar edge-to-edge si es necesario
    }
}
