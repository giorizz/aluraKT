package br.com.alurinha.bytebank.teste

import java.lang.NumberFormatException

fun testaExpressao() {
    println("início main")
    val entrada: String = "1"

    val valorRecebido: Double? = try {
        entrada.toDouble()
    } catch (e: NumberFormatException) {
        println("Problema na conversao")
        e.printStackTrace()
        null
    }

    val valorComTaxa: Double? = if (valorRecebido != null) {
        valorRecebido * 5
    } else {
        null
    }

    if (valorComTaxa != null) {
        println("valor aqui recebido $valorComTaxa")
    } else {
        println("valor inválido")
    }
}
