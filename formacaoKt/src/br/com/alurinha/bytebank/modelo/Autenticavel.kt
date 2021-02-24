package br.com.alurinha.bytebank.modelo

interface Autenticavel {

    fun autentica(senha: Int): Boolean

}