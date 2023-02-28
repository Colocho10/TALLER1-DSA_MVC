package com.example.taller.View

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.example.taller.R
import com.example.taller.controller.PromedioController

class Promedio : AppCompatActivity() {
    private val controller = PromedioController(this)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_promedio)

        val botonCalcular: Button = findViewById(R.id.btnCalcular)
        botonCalcular.setOnClickListener { controller.realizarCalculo() }
    }

    fun mostrarResultado(nombre: String, resultado: String) {
        val campoResult: TextView = findViewById(R.id.txtResultado)
        campoResult.text = "Hola $nombre, usted ha $resultado"
        Toast.makeText(this, resultado, Toast.LENGTH_LONG).show()
    }

    fun mostrarError() {
        Toast.makeText(this, "Error en el cálculo del promedio", Toast.LENGTH_LONG).show()
    }

}