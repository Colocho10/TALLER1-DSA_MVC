package com.example.taller

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.taller.View.Calculadora
import com.example.taller.View.Promedio
import com.example.taller.View.salario

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    val btnNext = findViewById<Button>(R.id.button1)
        val btn2 = findViewById<Button>(R.id.button2)
        val btn3 = findViewById<Button>(R.id.button3)


    btnNext.setOnClickListener {
        val intent = Intent(this, Promedio::class.java)
        startActivity(intent)
    }

        btn2.setOnClickListener {
            val intent = Intent(this, salario::class.java)
            startActivity(intent)
        }

        btn3.setOnClickListener {
            val intent = Intent(this, Calculadora::class.java)
            startActivity(intent)
        }

}

}