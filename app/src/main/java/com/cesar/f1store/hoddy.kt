package com.cesar.f1store

import android.app.DatePickerDialog
import android.app.TimePickerDialog
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.RadioButton
import android.widget.RadioGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import java.text.SimpleDateFormat
import java.util.Calendar
import java.util.Locale
import android.app.AlertDialog

class hoddy : AppCompatActivity() {
    private var selectedSize: String = ""
    private var selectedDate: String = ""
    private var selectedTime: String = ""
    private var isPremiumSelected: Boolean = false
    private val calendar = Calendar.getInstance()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_hoddy)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.activity_hoddy)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val radioGroupSizes = findViewById<RadioGroup>(R.id.radioGroupSizes)
        val buttonSelectDate = findViewById<Button>(R.id.buttonSelectDate)
        val buttonSelectTime = findViewById<Button>(R.id.buttonSelectTime)
        val checkBoxPremium = findViewById<CheckBox>(R.id.checkBoxPremium)
        val buttonConfirmPurchase = findViewById<Button>(R.id.buttonConfirmPurchase)

        radioGroupSizes.setOnCheckedChangeListener { group, checkedId ->
            val radioButton = findViewById<RadioButton>(checkedId)
            selectedSize = radioButton.text.toString()
            AlertDialog.Builder(this).apply {
                setTitle("Selected Size")
                setMessage("Size selected: $selectedSize")
                setPositiveButton("OK") { dialog, _ ->
                    dialog.dismiss()
                }
                create()
                show()
            }
        }

        buttonSelectDate.setOnClickListener {
            showDatePickerDialog()
        }

        buttonSelectTime.setOnClickListener {
            showTimePickerDialog()
        }

        checkBoxPremium.setOnCheckedChangeListener { buttonView, isChecked ->
            isPremiumSelected = isChecked
            AlertDialog.Builder(this).apply {
                setTitle("Premium Selected")
                setMessage("Premium selected: $isChecked")
                setPositiveButton("OK") { dialog, _ ->
                    dialog.dismiss()
                }
                create()
                show()
            }
        }

        buttonConfirmPurchase.setOnClickListener {
            // Crea un constructor de AlertDialog
            val builder = AlertDialog.Builder(this)

            // Configura el título y el mensaje del AlertDialog
            builder.setTitle("Confirm Purchase")
                .setMessage("Are you sure you want to confirm this purchase?")

            // Configura los botones positivo y negativo
            builder.setPositiveButton("Confirm") { dialog, which ->
                // Aquí implementas la lógica para confirmar la compra con los detalles seleccionados
                val message = "Purchase confirmed:\nSize: $selectedSize\nDate: $selectedDate\nTime: $selectedTime\nPremium: $isPremiumSelected"
                AlertDialog.Builder(this).apply {
                    setTitle("Purchase Confirmed")
                    setMessage(message)
                    setPositiveButton("OK") { dialog, _ ->
                        dialog.dismiss()
                    }
                    create()
                    show()
                }
            }
            builder.setNegativeButton("Cancel") { dialog, which ->
                // Si el usuario cancela, cierra el diálogo sin hacer nada
                dialog.dismiss()
            }

            // Crea y muestra el AlertDialog
            val dialog = builder.create()
            dialog.show()
        }

    }

    private fun showDatePickerDialog() {
        val datePickerDialog = DatePickerDialog(
            this,
            { _, year, month, dayOfMonth ->
                calendar.set(Calendar.YEAR, year)
                calendar.set(Calendar.MONTH, month)
                calendar.set(Calendar.DAY_OF_MONTH, dayOfMonth)
                updateSelectedDate()
            },
            calendar.get(Calendar.YEAR),
            calendar.get(Calendar.MONTH),
            calendar.get(Calendar.DAY_OF_MONTH)
        )
        datePickerDialog.show()
    }

    private fun showTimePickerDialog() {
        val timePickerDialog = TimePickerDialog(
            this,
            { _, hourOfDay, minute ->
                calendar.set(Calendar.HOUR_OF_DAY, hourOfDay)
                calendar.set(Calendar.MINUTE, minute)
                updateSelectedTime()
            },
            calendar.get(Calendar.HOUR_OF_DAY),
            calendar.get(Calendar.MINUTE),
            true
        )
        timePickerDialog.show()
    }

    private fun updateSelectedDate() {
        val dateFormat = SimpleDateFormat("dd/MM/yyyy", Locale.getDefault())
        selectedDate = dateFormat.format(calendar.time)
        AlertDialog.Builder(this).apply {
            setTitle("Selected Date")
            setMessage("Date selected: $selectedDate")
            setPositiveButton("OK") { dialog, _ ->
                dialog.dismiss()
            }
            create()
            show()
        }
    }

    private fun updateSelectedTime() {
        val timeFormat = SimpleDateFormat("HH:mm", Locale.getDefault())
        selectedTime = timeFormat.format(calendar.time)
        AlertDialog.Builder(this).apply {
            setTitle("Selected Time")
            setMessage("Time selected: $selectedTime")
            setPositiveButton("OK") { dialog, _ ->
                dialog.dismiss()
            }
            create()
            show()
        }
    }

    private fun enableEdgeToEdge() {
        // Código para habilitar edge-to-edge si es necesario
    }
}
