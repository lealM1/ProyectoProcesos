import kotlin.random.Random // Para la función random.nextInt

class ProcesoPadre {
    val numeroSecreto = Random.nextInt(1,101)
    // Con random.nextInt se almacena en la variable numeroSecreto
    // un número aleatorio  del 1 al 100, el 101 queda fuera del rango

    fun iniciarJuego() {
        println("El proceso padre ha generado un número secreto")
        println("--------")
        val procesoHijo = ProcesoHijo(numeroSecreto)
        procesoHijo.jugar() // Inicia el juego en el proceso hijo
    }
}