package br.com.alurinha.bytebank.teste

import br.com.alurinha.bytebank.modelo.Endereco

fun testaAny(){
    val endereco = Endereco(logradouro = "R. oriente", complemento = "giorizz")
    val enderecoNovo = Endereco(bairro = "Diadema", numero = 243)

    println(endereco.equals(enderecoNovo))

    println(endereco.hashCode())
    println(enderecoNovo.hashCode())

    println(endereco)
    println(enderecoNovo)
}

fun imprime(valor: Any): Any {
    println(valor)
    return valor
}
