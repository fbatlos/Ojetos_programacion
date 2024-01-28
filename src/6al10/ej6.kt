package `6al10`
data class Compra(var cliente: String, var dia: String, var monto: String, var domicilio: String){
   //no sé porque no me funciona el data class
}

data class Cliente(var nombre: String, var domicilio: Domicilio)

data class Domicilio(var domicilio: String, var numero: String)

class RepositorioCompras(var comprasData: List<List<String>>) {
    val compras: List<Unit> = comprasData.map {
        val compra = Compra(it[0], it[1], it[2], it[3])
        compra.copy(cliente = it[0], dia = it[1], monto = it[2], domicilio = it[3])
    }

}

fun main() {
    val comprasData = listOf(
        listOf("Nuria Costa", "5", "12780.78", "Calle Las Flores", "355"),
        listOf("Jorge Russo", "7", "699", "Mirasol", "218"),
        listOf("Nuria Costa", "7", "532.90", "Calle Las Flores", "355"),
        listOf("Julián Rodriguez", "12", "5715.99", "La Mancha", "761"),
        listOf("Jorge Russo", "15", "958", "Mirasol", "218")
    )

    val repositorioCompras = RepositorioCompras(comprasData)

    // Ahora puedes acceder a las compras dentro del RepositorioCompras
    val listaDeCompras = repositorioCompras.compras
    listaDeCompras.forEach { println(it) }
}
