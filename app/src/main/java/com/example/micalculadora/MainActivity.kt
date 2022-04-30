package com.example.micalculadora

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle



class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        unoButton.setOnClicklistener {numeroPresionado("1")}
        dosButton.setOnClickListener {numeroPresionado("2")}
        tresButton.setOnClickListener {numeroPresionado("3")}
        cuatroButton.setOnClickListener {numeroPresionado("4")}
        cincoButton.setOnClickListener {numeroPresionado("5")}
        seisButton.setOnClickListener {numeroPresionado("6")}
        sieteButton.setOnClickListener {numeroPresionado("7")}
        ochoButton.setOnClickListener {numeroPresionado("8")}
        nueveButton.setOnClickListener {numeroPresionado("9")}
        ceroButton.setOnClickListener {numeroPresionado("0")}

    }
    private fun numeroPresionado(digito: String){
        resultadoTextView.text = "${resultadoTextView}$digito"
    }
}