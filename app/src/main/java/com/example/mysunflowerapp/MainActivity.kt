package com.example.mysunflowerapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.graphics.Color

class MainActivity : AppCompatActivity() {

    lateinit var boton1:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        boton1 = findViewById(R.id.button1)

        boton1.setOnClickListener {
            if(boton1.text != "Soy Azul"){
                boton1.setBackgroundColor(Color.parseColor("#0352F0"))
                boton1.setText("Soy Axul")
            }
            else if(boton1.text != "Soy Rojo"){
                boton1.setBackgroundColor(Color.parseColor("#F01C03"))
                boton1.setText("Soy Rojo")
            }
            else if(boton1.text != "Soy Verde"){
                boton1.setBackgroundColor(Color.parseColor("#0CD843"))
                boton1.setText("Soy Verde")
            }
            else{
                boton1.setBackgroundColor(Color.parseColor("#E2F003"))
                boton1.setText("Soy Amarillo")
            }
        }


    }
}