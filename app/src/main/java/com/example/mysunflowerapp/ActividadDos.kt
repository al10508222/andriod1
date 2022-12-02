package com.example.mysunflowerapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class ActividadDos : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_actividad_dos)

        val mensaje_recibido:String = intent.getStringExtra("TEXTO").toString()
        var mensaje: TextView = findViewById(R.id.mensaje)
        mensaje.text = mensaje_recibido
    }
}