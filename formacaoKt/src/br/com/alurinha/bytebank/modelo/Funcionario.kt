package br.com.alurinha.bytebank.modelo

abstract class Funcionario(
    val nome: String,
    val cpf: String,
    val salario: Double
) {

    abstract val bonificacao: Double


}