package br.com.alurinha.bytebank.modelo

class Auxiliar(
    nome: String,
    cpf: String,
    salario: Double
) : Funcionario(
    nome = nome,
    salario = salario,
    cpf = cpf
) {
    override val bonificacao: Double
        get() = salario * 0.05


}