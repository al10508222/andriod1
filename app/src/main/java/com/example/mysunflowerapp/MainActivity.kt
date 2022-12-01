package com.example.mysunflowerapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.graphics.Color
import android.view.View
import android.widget.AbsListView
import android.widget.EditText

const val TEXTO = "TEXTO"
class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        boton1 = findViewById(R.id.button1)
        button_mensaje = findViewById(R.id.button_mensaje)


        boton1.setOnClickListener {
            if(boton1.text == "Button"){
                boton1.setBackgroundColor(Color.parseColor("#0352F0"))
                boton1.setText("Soy Azul")
            }
            else if(boton1.text == "Soy Azul"){
                boton1.setBackgroundColor(Color.parseColor("#F01C03"))
                boton1.setText("Soy Rojo")
            }
            else if(boton1.text == "Soy Rojo"){
                boton1.setBackgroundColor(Color.parseColor("#0CD843"))
                boton1.setText("Soy Verde")
            }
            else if(boton1.text == "Soy Amarillo"){
                boton1.setBackgroundColor(Color.parseColor("#000000"))
                boton1.setText("Button")
            }
            else{
                boton1.setBackgroundColor(Color.parseColor("#E2F003"))
                boton1.setText("Soy Amarillo")
            }
        }

        button_mensaje.setOnClickListener { changeActivity(it) }


    }
    lateinit var boton1:Button
    lateinit var button_mensaje:Button

    fun changeActivity(view: View){
        var editText = findViewById<EditText>(R.id.campo_texto)
        var mensaje = editText.text.toString()
        val intent = Intent(this, ActividadDos::class.java).apply {
            putExtra(TEXTO,mensaje)
        }
        startActivity(intent)
    }
}