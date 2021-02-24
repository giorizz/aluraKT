package br.com.alurinha.bytebank.teste

import br.com.alurinha.bytebank.exception.SaldoInsuficienteException

fun funcao1() {
    println("início funcao1")
    try {
        funcao2()
    } catch (e: SaldoInsuficienteException) {
//        println(e.message)
//        println(e.stackTrace)
//        println(e.cause)
        //este pega todos os erros
        e.printStackTrace()
        println("SaldoInsuficienteException foi encontrado")
    }
    println("fim funcao1")
}

fun funcao2() {
    println("início funcao2")
    for (i in 1..5) {
        println(i)
        throw SaldoInsuficienteException()
    }
    println("fim funcao2")
}