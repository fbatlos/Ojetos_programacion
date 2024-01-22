/**
 * Clase Compra
 * @param cliente cliente que realizo la compra
 * @param dia dia de la compra
 * @param monto monto de la compra
 * @constructor Crea una compra con cliente, dia y monto
 */
data class compra(var cliente: List<String> , var dia:List<Int> , var monto:List<String>){


    fun compra(){


    }
}

/**
 * Clase Cliente
 * @param nombre nombre del cliente
 * @param domicilio domicilio del cliente
 * @constructor Crea un cliente con nombre y domicilio


data class cliente(var nombre:String , var domicilo:String){


}
*/
class repositorioCompras(var complas:List<List<Any>>){

}



fun main(){




    val compras = (listOf<List<Any>>(listOf("Nuria Costa", 5, "12780.78", "Calle Las Flores 355"),
        listOf("Jorge Russo", 7, "699", "Mirasol 218"),
        listOf("Nuria Costa", 7, "532.90", "Calle Las Flores 355"),
        listOf("Julián Rodriguez", 12, "5715.99", "La Mancha 761"),
        listOf("Jorge Russo", 15, "958", "Mirasol 218"))
    )







    var nombres = nombre(compras)
    var dias = dia(compras)
    var montos = monto(compras)
    var calles = calle(compras)

}
fun comprador():List<Any>{

    do {
        confirma=comprador()
    }while (confirma == null)
}


fun nombre(compras: List<List<Any>>): List<String> {
    val nombres = mutableListOf<String>()
    compras.forEach{nombres.add(it[0].toString())}
    return nombres.toList()
}

fun dia(compras: List<List<Any>>): List<Int> {
    val dias = mutableListOf<Int>()
    compras.forEach{dias.add(it[1] as Int)}
    return dias.toList()
}

fun monto(compras: List<List<Any>>): List<String> {
    val monto = mutableListOf<String>()
    compras.forEach{monto.add(it[2].toString())}
    return monto.toList()
}

fun calle(compras: List<List<Any>>): List<String> {
    val calle = mutableListOf<String>()
    compras.forEach{calle.add(it[3].toString())}
    return calle.toList()
}