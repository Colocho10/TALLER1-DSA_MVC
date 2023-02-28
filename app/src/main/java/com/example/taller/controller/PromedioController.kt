package com.example.taller.controller

import android.widget.EditText
import com.example.taller.R
import com.example.taller.View.Promedio

class PromedioController(private val view: Promedio) {

    fun realizarCalculo() {
        val campoNombre: EditText = view.findViewById(R.id.idNombreTxt)
        val campoNota1: EditText = view.findViewById(R.id.idNota1Txt)
        val campoNota2: EditText = view.findViewById(R.id.idNota2Txt)
        val campoNota3: EditText = view.findViewById(R.id.idNota3txt)
        val campoNota4: EditText = view.findViewById(R.id.idNota4Txt)
        val campoNota5: EditText = view.findViewById(R.id.idNota5Txt)

        val nombre: String = campoNombre.text.toString()
        val Nota1: Double = campoNota1.text.toString().toDouble()
        val Nota2: Double = campoNota2.text.toString().toDouble()
        val Nota3: Double = campoNota3.text.toString().toDouble()
        val Nota4: Double = campoNota4.text.toString().toDouble()
        val Nota5: Double = campoNota5.text.toString().toDouble()

        val prom: Double = (Nota1 + Nota2 + Nota3 + Nota4 + Nota5) / 5

        var result = ""
        if (prom >= 6.0) {
            result="aprobado con nota de $prom"
        } else {
            result="reprobado con nota de $prom"
        }

        if (nombre.isNotEmpty()) {
            view.mostrarResultado(nombre, result)
        } else {
            view.mostrarError()
        }
    }

}