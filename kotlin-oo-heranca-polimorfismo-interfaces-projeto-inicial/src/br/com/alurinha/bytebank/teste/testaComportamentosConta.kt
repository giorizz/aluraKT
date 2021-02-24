import br.com.alurinha.bytebank.exception.FalhaAutenticacaoException
import br.com.alurinha.bytebank.exception.SaldoInsuficienteException
import br.com.alurinha.bytebank.modelo.*
import java.lang.Exception

fun testaComportamentosConta() {
    println("Bem vindo ao Bytebank")

    val alex = Cliente(nome = "Alex", senha = 1, cpf = "")
    val contaAlex = ContaCorrente(titular = alex, numero = 1000)
    contaAlex.deposita(200.0)

    val fran = Cliente(nome = "Fran", senha = 2, cpf = "")
    val contaFran = ContaPoupanca(numero = 1001, titular = fran)
    contaFran.deposita(300.0)

    println(contaFran.titular)
    println(contaFran.numero)
    println(contaFran.saldo)

    println(contaAlex.titular)
    println(contaAlex.numero)
    println(contaAlex.saldo)

    println("depositando na conta do Alex")
    contaAlex.deposita(50.0)
    println(contaAlex.saldo)

    println("depositando na conta da Fran")
    contaFran.deposita(70.0)
    println(contaFran.saldo)

    println("sacando na conta do Alex")
    contaAlex.saca(250.0)
    println(contaAlex.saldo)

    println("sacando na conta da Fran")
    contaFran.saca(100.0)
    println(contaFran.saldo)

    println("saque em excesso na conta do Alex")
    contaAlex.saca(100.0)
    println(contaAlex.saldo)

    println("saque em excesso na conta da Fran")
    contaFran.saca(500.0)
    println(contaFran.saldo)

    println("Transferência da conta da Fran para o Alex")

    try {
        contaFran.transfere(destino = contaAlex, valor = 200.0, senha = 5)
        println("Transferência sucedida")
    }catch (e: SaldoInsuficienteException) {
        println("Falha na transferencia")
        println("Saldo insuficiente")
        e.printStackTrace()
    }catch (e: FalhaAutenticacaoException){
        println("Falha na transferencia")
        println("Falha na Autenticaçao")
        e.printStackTrace()
    }catch (e: Exception) {
        println("Erro desconhecido")
        e.printStackTrace()
    }

    println(contaAlex.saldo)
    println(contaFran.saldo)
}
