package com.example.taller

import android.widget.EditText

interface PromedioView {
    fun mostrarResultado(resultado: String, result: String)
    fun mostrarError()
    abstract fun findViewById(idNombreTxt: Int): EditText
}