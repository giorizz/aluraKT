package br.com.alurinha.bytebank.modelo

class Diretor(
    nome: String,
    cpf: String,
    salario: Double,
    senha: Int,
    val plr: Double

) : FuncionarioAdmin(
    nome = nome,
    salario = salario,
    cpf = cpf,
    senha = senha
) {

    override val bonificacao: Double
        get() {
            return salario + plr
        }

}