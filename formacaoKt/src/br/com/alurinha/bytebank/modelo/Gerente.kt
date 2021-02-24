package br.com.alurinha.bytebank.modelo

class Gerente(
    nome: String,
    cpf: String,
    salario: Double,
    senha: Int
) : FuncionarioAdmin(
    nome = nome,
    salario = salario,
    cpf = cpf,
    senha = senha
) {

    override val bonificacao: Double
        get() {
            return salario * 0.2
        }

}