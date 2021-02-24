package br.com.alurinha.bytebank.exception

import java.lang.Exception

class FalhaAutenticacaoException(
    mensagem: String = "Falha de autenticacao"
) : Exception(mensagem)