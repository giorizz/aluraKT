import br.com.alurinha.bytebank.modelo.*

fun testaCopiasEReferencias() {
    val numeroX = 10
    var numeroY = numeroX
    numeroY++

    println("numeroX $numeroX")
    println("numeroY $numeroY")

    val joao = Cliente(nome = "Joao", cpf = "", senha = 1)
    val contaJoao = ContaPoupanca(joao, 1002)
    contaJoao.titular = joao

    var contaMaria = ContaCorrente(Cliente(nome = "Maria", cpf = "", senha = 2), 1003)
    contaMaria.titular.nome = "Maria"
    contaJoao.titular.nome = "João"

    println("titular conta joao: ${contaJoao.titular.nome}")
    println("titular conta maria: ${contaMaria.titular.nome}")

    println(contaJoao)
    println(contaMaria)
}
