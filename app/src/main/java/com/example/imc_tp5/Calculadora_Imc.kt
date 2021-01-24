package com.example.imc_tp5

fun calculaIMC(peso: String, altura: String): Double =
    peso.toDouble() / (altura.toDouble() * altura.toDouble())

fun infoIMC(indice: Double): String{

    return when (indice) {
        in 0.0..17.0 -> "Muito abaixo do peso"
        in 17.1..18.49 -> "Abaixo do peso"
        in 18.5..24.99 -> "Peso normal"
        in 25.0..29.99 -> "Acima do peso"
        in 30.0..34.99 -> "Obesidade I"
        in 35.0..39.99 -> "Obesidade II(severa)"
        else -> "Obesidade III(mórbida)"
    }
}