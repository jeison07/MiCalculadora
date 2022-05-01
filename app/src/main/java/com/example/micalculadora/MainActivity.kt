package com.example.micalculadora


import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*





class MainActivity : AppCompatActivity() {

    private var num1: Double = 0.0
    private var num2: Double = 0.0
    private var operacion: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)






        unoButton.setOnClickListener {numeroPresionado("1")}
        dosButton.setOnClickListener {numeroPresionado("2")}
        tresButton.setOnClickListener {numeroPresionado("3")}
        cuatroButton.setOnClickListener {numeroPresionado("4")}
        cincoButton.setOnClickListener {numeroPresionado("5")}
        seisButton.setOnClickListener {numeroPresionado("6")}
        sieteButton.setOnClickListener {numeroPresionado("7")}
        ochoButton.setOnClickListener {numeroPresionado("8")}
        nueveButton.setOnClickListener {numeroPresionado("9")}
        ceroButton.setOnClickListener {numeroPresionado("0")}

        sumaButton.setOnClickListener { operacionPrecionanada(SUMA) }
        restaButton.setOnClickListener { operacionPrecionanada(RESTA) }
        multiplicacionButton.setOnClickListener { operacionPrecionanada(MULTIPLICACION) }
        dividicionButton.setOnClickListener { operacionPrecionanada(DIVICION) }



        borrarButton.setOnClickListener {
            num1 = 0.0
            num2 = 0.0
            resultadoTextView.text = "0"
            operacion = NO_OPERACION
        }

        igualButton.setOnClickListener {
            var resultado: Double = when(operacion){
                SUMA -> num1+num2
                RESTA -> num1-num2
                MULTIPLICACION -> num1*num2
                DIVICION -> num1/num2
                else-> 0.0
            }
            resultadoTextView.text = resultado.toString()
        }




    }
    private fun numeroPresionado(numero: String) {
        if (resultadoTextView.text == "0" && resultadoTextView.text == "0.0" ) {
            resultadoTextView.text = "${numero}"
        } else{
            resultadoTextView.text = "${resultadoTextView.text}$numero"
        }

        if (operacion == NO_OPERACION){
            num1 = resultadoTextView.text.toString().toDouble()
        }else{
            num2 = resultadoTextView.text.toString().toDouble()
        }
    }
    private fun operacionPrecionanada(operacion: Int) {
        this.operacion = operacion

        resultadoTextView.text = "0"

    }
       companion object{
           const val SUMA = 1
           const val RESTA = 2
           const val MULTIPLICACION = 3
           const val DIVICION = 4
           const val NO_OPERACION = 0
    }
}