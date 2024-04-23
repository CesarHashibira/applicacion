package com.cesar.f1store
// LoginActivity.kt
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val editTextUsername = findViewById<EditText>(R.id.editTextUsername)
        val editTextPassword = findViewById<EditText>(R.id.editTextPassword)
        val buttonLogin = findViewById<Button>(R.id.buttonLogin)

        // Listener para el botón de inicio de sesión
        buttonLogin.setOnClickListener {
            val username = editTextUsername.text.toString()
            val password = editTextPassword.text.toString()

            // Verificar el nombre de usuario y la contraseña
            if (username == "admin" && password == "admin") {
                // Iniciar sesión como administrador
                Toast.makeText(this, "Inicio de sesión como administrador", Toast.LENGTH_SHORT).show()

                // Redirigir a la actividad AddProductActivity
                val intent = Intent(this, AddProductActivity::class.java)
                startActivity(intent)

            } else if (username == "usuario" && password == "usuario") {
                // Iniciar sesión como usuario normal
                Toast.makeText(this, "Inicio de sesión como usuario normal", Toast.LENGTH_SHORT).show()
                // Aquí podrías iniciar una nueva actividad para la interfaz de usuario normal
                // Redirigir a la actividad MainActivity (o cualquier otra actividad relevante)
                val intent = Intent(this, MainActivity::class.java)
                startActivity(intent)

            } else {
                // Credenciales incorrectas
                Toast.makeText(this, "Nombre de usuario o contraseña incorrectos", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
