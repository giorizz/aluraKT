import br.com.alurinha.bytebank.modelo.*

fun testaObjects() {

    val fran = object : Autenticavel {
        val nome: String = "Fran"
        val cpf: String = "432423423"
        val senha: Int = 2345

        override fun autentica(senha: Int) = this.senha == senha
    }

    val sistemaInterno = SistemaInterno()
    sistemaInterno.entra(fran, 1000)

    println("nome do cliente ${fran.nome}")

    val alex = Cliente(nome = "alex", cpf = "", senha = 1)
    val contaPoupanca = ContaPoupanca(titular = alex, numero = 1000)
    val contaCorrente = ContaCorrente(titular = alex, numero = 1100)
    testaContasDiferentes()

    println("Total de contas: ${Conta.total}")

}




