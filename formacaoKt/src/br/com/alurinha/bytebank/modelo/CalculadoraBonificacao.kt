package br.com.alurinha.bytebank.modelo

class CalculadoraBonificacao {

    var total: Double = 0.0

    fun registra(funcionario: Funcionario){
            this.total += funcionario.bonificacao

    }

//    fun registra(gerente: br.com.alurinha.bytebank.modelo.Gerente){
//        this.total += gerente.bonificacao
//    }
//
//    fun registra(diretor: br.com.alurinha.bytebank.modelo.Diretor){
//        this.total += diretor.bonificacao
//    }



}