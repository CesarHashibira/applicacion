package com.cesar.f1store


// AddProductActivity.kt
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class AddProductActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_product)

        val editTextProductName = findViewById<EditText>(R.id.editTextProductName)
        val editTextProductDescription = findViewById<EditText>(R.id.editTextProductDescription)
        val editTextProductPrice = findViewById<EditText>(R.id.editTextProductPrice)
        val buttonAddProduct = findViewById<Button>(R.id.buttonAddProduct)

        // Listener para el botón de agregar producto
        buttonAddProduct.setOnClickListener {
            val productName = editTextProductName.text.toString()
            val productDescription = editTextProductDescription.text.toString()
            val productPrice = editTextProductPrice.text.toString().toDoubleOrNull()

            if (productName.isNotEmpty() && productDescription.isNotEmpty() && productPrice != null) {

                Toast.makeText(this, "Producto agregado exitosamente", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Por favor, completa todos los campos y asegúrate de ingresar un precio válido.", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
