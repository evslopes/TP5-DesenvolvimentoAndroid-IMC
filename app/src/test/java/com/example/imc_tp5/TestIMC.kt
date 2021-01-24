package com.example.imc_tp5

import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */

class TestIMC {
    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
    }

    @Test
    fun teste_IMC(){
        assertEquals(calculaIMC("90.0", "1.75"), 29.38, 2.0)
    }

    /*in 0.0..17.0 -> "Muito abaixo do peso"
    in 17.1..18.49 -> "Abaixo do peso"
    in 18.5..24.99 -> "Peso normal"
    in 25.0..29.99 -> "Acima do peso"
    in 30.0..34.99 -> "Obesidade I"
    in 35.0..39.99 -> "Obesidade II(severa)"
    else -> "Obesidade III(mórbida)"*/

    @Test
    fun teste_Info_Muito_Abaixo_Peso(){
        assertEquals(infoIMC(15.0), "Muito abaixo do peso")
    }

    @Test
    fun teste_Info_Abaixo_Peso(){
        assertEquals(infoIMC(18.39), "Abaixo do peso")
    }

    @Test
    fun teste_Info_Peso_Normal(){
        assertEquals(infoIMC(23.34), "Peso normal")
    }

    @Test
    fun teste_Info_Peso_MorbidoIII(){
        assertEquals(infoIMC(50.01), "Obesidade III(mórbida)")
    }


}