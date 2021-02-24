package br.com.alurinha.bytebank.modelo

class Analista(
    nome: String,
    cpf: String,
    salario: Double
) : Funcionario(
    nome = nome,
    salario = salario,
    cpf = cpf
) {

    override val bonificacao: Double
        get() {
            return salario * 0.1
        }

}