data class Domicilio(val calle: String, val numero: Int) {
    fun dirCompleta(): String {
        return "$calle $numero"
    }
}

data class Cliente(val nombre: String, val domicilio: Domicilio)

data class Compra(val cliente: Cliente, val dia: String, val monto: Double)

class RepositorioCompras {
    private val compras = mutableListOf<Compra>()

    fun agregarCompra(compra: Compra) {
        compras.add(compra)
    }

    fun domicilios(): Set<String> {
        val domiciliosUnicos = mutableSetOf<String>()
        for (compra in compras) {
            domiciliosUnicos.add(compra.cliente.domicilio.dirCompleta())
        }
        return domiciliosUnicos
    }
}

fun main() {
    // Ejemplo de uso
    val domicilio1 = Domicilio("Calle A", 123)
    val domicilio2 = Domicilio("Calle B", 456)

    val cliente1 = Cliente("Cliente 1", domicilio1)
    val cliente2 = Cliente("Cliente 2", domicilio2)

    val compra1 = Compra(cliente1, "2024-01-23", 100.0)
    val compra2 = Compra(cliente2, "2024-01-24", 150.0)

    val repositorio = RepositorioCompras()
    repositorio.agregarCompra(compra1)
    repositorio.agregarCompra(compra2)

    val domiciliosUnicos = repositorio.domicilios()

    println("Domicilios a los cuales se debe enviar una factura de compra:")
    for (domicilio in domiciliosUnicos) {
        println("- $domicilio")
    }
}
