fun main() {
    val numero = 6
    var fatorial = 1

    if (numero == 0 || numero == 1) {
        fatorial = 1
    } else {
        var contador = numero

        while (contador >= 1) {
            fatorial *= contador
            contador--
        }
    }

    println("Fatorial de $numero = $fatorial")
}
