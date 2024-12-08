class ProcesoHijo(val numeroSecreto: Int) {

    fun jugar() {
        var intento: Int? // Se declara el int como "int?" para que pueda
                            // ser una variable de tipo null al principio del juego
                            // y posteriormente verificar que ya tiene un valor entero asignado
        var adivinado: Boolean = false
        var contador = 1

        println("El proceso hijo ha iniciado el juego de adivinar el número")
        println("--------")
        println("Intenta adivinar el número secreto entre el 1 y el 100")
        println("--------")

        while (!adivinado) {
                print("Introduce tu intento número $contador: ")
                intento = readLine()?.toIntOrNull() // Lee la entrada y convierte a int
                                                    // y si no puede  se queda como null
                if (intento == null) {
                    println("Introduce un número valido!")
                    continue // Si el intento no es un número pide otro valor
                }
            contador++ // Solo incrementa si el intento es válido

            when {
                // Se compara el número secreto con el número introducido
                intento < numeroSecreto -> println("El número es mayor")
                intento > numeroSecreto -> println("El numero es menor")
                else -> {
                    println("Correcto, has adivinado el número en $contador intentos")
                    adivinado = true // Cambia para salir del bucle
                }
            }
        }
    }
}