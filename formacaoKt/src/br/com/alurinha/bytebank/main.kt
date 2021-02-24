import br.com.alurinha.bytebank.modelo.Endereco
import java.lang.IllegalStateException

fun main() {

    var endereco: Endereco? = Endereco(logradouro = "Rua oriente Monti")
    endereco?.let {
        println(it.logradouro.length)
        val tamanhoComplemento: Int = it.complemento?.length ?: throw IllegalStateException("Complemento não pode ser nulo")
        println(tamanhoComplemento)
    }
}





