package com.example.imc_tp5

import android.icu.text.DecimalFormat
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonCalcular.setOnClickListener {
            var peso = editTextPeso.text.toString()
            var altura = editTextAltura.text.toString()

            if(peso != "" &&  altura != "") {
                val imc = calculaIMC(peso, altura)
                val imcFormat = String.format("%.2f", imc)
                editTextIMC.text = "IMC: " + imcFormat
                textViewGrauObesidade.text = infoIMC(imc)
            }
            else {
                textViewGrauObesidade.text = "Valores inválidos!"
            }
        }
    }
}