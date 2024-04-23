package com.cesar.f1store

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

// Asegúrate de que esta importación esté presente
import com.cesar.f1store.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        enableEdgeToEdge()

        // Obtener referencias a los botones
        val button1 = findViewById<Button>(R.id.button1)
        val button2 = findViewById<Button>(R.id.button2)
        val button3 = findViewById<Button>(R.id.button3)
        val button4 = findViewById<Button>(R.id.button4)
        val button5 = findViewById<Button>(R.id.button5)
        val button6 = findViewById<Button>(R.id.button6)
        val button7 = findViewById<Button>(R.id.button7)
        val button8 = findViewById<Button>(R.id.button8)
        val button9 = findViewById<Button>(R.id.button9)

        // Agregar OnClickListener a cada botón
        button1.setOnClickListener {
            // Aquí defines lo que quieres que haga el botón 1 al hacer clic
            // Por ejemplo, abrir una nueva actividad
            val intent = Intent(this, chinaActivity::class.java)
            Toast.makeText(this, "Botón 1 presionado", Toast.LENGTH_SHORT).show()

            startActivity(intent)
        }

        button2.setOnClickListener {
            // Aquí defines lo que quieres que haga el botón 3 al hacer clic
            // Por ejemplo, mostrar un mensaje
            val intent = Intent(this, miami::class.java)
            Toast.makeText(this, "Botón 2 presionado", Toast.LENGTH_SHORT).show()
            startActivity(intent)
        }

        button3.setOnClickListener {
            // Aquí defines lo que quieres que haga el botón 3 al hacer clic
            // Por ejemplo, mostrar un mensaje

            Toast.makeText(this, "Botón 3 presionado", Toast.LENGTH_SHORT).show()
        }

        button4.setOnClickListener {
            // Aquí defines lo que quieres que haga el botón 4 al hacer clic
            // Por ejemplo, mostrar un mensaje
            Toast.makeText(this, "Botón 4 presionado", Toast.LENGTH_SHORT).show()
        }

        button5.setOnClickListener {
            // Aquí defines lo que quieres que haga el botón 5 al hacer clic
            // Por ejemplo, mostrar un mensaje
            Toast.makeText(this, "Botón 5 presionado", Toast.LENGTH_SHORT).show()
        }

        button6.setOnClickListener {
            // Aquí defines lo que quieres que haga el botón 6 al hacer clic
            // Por ejemplo, mostrar un mensaje
            Toast.makeText(this, "Botón 6 presionado", Toast.LENGTH_SHORT).show()
        }

        button7.setOnClickListener {
            // Aquí defines lo que quieres que haga el botón 7 al hacer clic
            // Por ejemplo, mostrar un mensaje
            Toast.makeText(this, "Botón 7 presionado", Toast.LENGTH_SHORT).show()
        }

        button8.setOnClickListener {
            // Aquí defines lo que quieres que haga el botón 7 al hacer clic
            // Por ejemplo, mostrar un mensaje
            Toast.makeText(this, "Botón 8 presionado", Toast.LENGTH_SHORT).show()
        }

        button9.setOnClickListener {
            // Aquí defines lo que quieres que haga el botón 7 al hacer clic
            // Por ejemplo, mostrar un mensaje
            val intent = Intent(this, videosviw::class.java)
            Toast.makeText(this, "Botón 9 presionado", Toast.LENGTH_SHORT).show()
            startActivity(intent)
        }
    }

    private fun enableEdgeToEdge() {
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}
