import br.com.alurinha.bytebank.modelo.*

fun testaFuncionarios() {
    println()
    val alex = Analista(nome = "Alex", cpf = "423.423.42-03", salario = 1000.00)

    println("nome ${alex.nome}")
    println("cpf ${alex.cpf}")
    println("salario ${alex.salario}")
    println("bonificacao ${alex.bonificacao}")

    println("")
    val fran = Gerente(nome = "Fran", cpf = "432.876.65-03", salario = 3000.00, senha = 3424)
    println("nome ${fran.nome}")
    println("cpf ${fran.cpf}")
    println("salario ${fran.salario}")
    println("bonificacao ${fran.bonificacao}")

    if (fran.autentica(3424)) {
        println("autenticou com sucesso")
    } else {
        println("Falha na autenticação")
    }

    println("")
    val gio = Diretor(nome = "Gio", cpf = "123.123.65-03", salario = 4500.00, senha = 1234, plr = 3.000)
    println("nome ${gio.nome}")
    println("cpf ${gio.cpf}")
    println("salario ${gio.salario}")
    println("bonificacao ${gio.bonificacao}")

    if (gio.autentica(1234)) {
        println("autenticou com sucesso")
    } else {
        println("Falha na autenticação")
    }

    val maria = Analista(nome = "Maria", cpf = "234.423.432.43", salario = 3454.0)

    val calculadora = CalculadoraBonificacao()
    calculadora.registra(alex)
    calculadora.registra(fran)
    calculadora.registra(gio)
    calculadora.registra(maria)

    println("")
    println("total de bonificacao = ${calculadora.total}")
}
