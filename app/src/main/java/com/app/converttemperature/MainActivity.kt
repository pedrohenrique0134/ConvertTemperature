package com.app.converttemperature

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.LinearLayout
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button: LinearLayout = findViewById(R.id.btn_conv)

        button.setOnClickListener {
            val temperatura: EditText = findViewById(R.id.temperatura)
            var transforme = (temperatura.text.toString().toInt() * 1.8) + 32
            val resultado: TextView = findViewById(R.id.resultado)
            resultado.visibility = View.VISIBLE
            resultado.setText(transforme.toString())
        }
    }
}