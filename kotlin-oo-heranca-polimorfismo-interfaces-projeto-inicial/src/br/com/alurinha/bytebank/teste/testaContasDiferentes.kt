import br.com.alurinha.bytebank.modelo.*

fun testaContasDiferentes() {
    println("Bem vindo ao Bytebank")

    val contaCorrente = ContaCorrente(
        titular = Cliente(
            nome = "Alex",
            senha = 1,
            cpf = "12121212121212",
            endereco = Endereco(logradouro = "Oriente")
        ),
        numero = 1000
    )
    val contaPoupanca = ContaPoupanca(
        titular = Cliente(nome = "Fran", senha = 2, cpf = ""),
        numero = 1001
    )

    println("titular")
    println("nome do titular ${contaCorrente.titular.nome}")
    println("cpf do titular ${contaCorrente.titular.cpf}")
    println("saldo corrente  ${contaCorrente.saldo}")
    println("endereco titular  ${contaCorrente.titular.endereco.logradouro}")
//    println("senha do titular ${contaCorrente.titular.senha}")


    println("")
    contaCorrente.deposita(1000.0)
    contaPoupanca.deposita(1000.0)

    println("saldo conta corrente: ${contaCorrente.saldo}")
    println("saldo conta poupanca: ${contaPoupanca.saldo}")

    contaCorrente.saca(100.0)
    contaPoupanca.saca(100.0)

    println("saldo após saque conta corrente: ${contaCorrente.saldo}")
    println("saldo após saque conta poupanca: ${contaPoupanca.saldo}")

    contaCorrente.transfere(100.00, contaPoupanca)

    println("saldo corrente após transferir poupanca: ${contaCorrente.saldo}")
    println("saldo poupanca apos receber da corrente: ${contaPoupanca.saldo}")

    contaPoupanca.transfere(100.00, contaCorrente)

    println("saldo poupanca após transferir corrente: ${contaPoupanca.saldo}")
    println("saldo corrente apos receber da poupanca: ${contaCorrente.saldo}")
}
