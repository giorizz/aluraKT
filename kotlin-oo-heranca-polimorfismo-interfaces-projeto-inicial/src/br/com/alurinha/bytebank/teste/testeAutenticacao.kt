import br.com.alurinha.bytebank.modelo.*

fun testaAutenticacao() {
    val gerente = Gerente(
        nome = "Gio",
        cpf = "123.456.789",
        salario = 111.00,
        senha = 1000
    )

    val diretor = Diretor(
        nome = "Fran",
        cpf = "987.654.432",
        salario = 200.00,
        senha = 1001,
        plr = 200.00
    )

    val cliente = Cliente(nome = "Barbara", cpf = "032.302.239", senha = 1234)

    val sistema = SistemaInterno()
    sistema.entra(gerente, 1000)
    sistema.entra(diretor, 1001)
    sistema.entra(cliente, 1234)

}
