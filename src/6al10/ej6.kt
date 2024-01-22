/**
 * Clase Compra
 * @param cliente cliente que realizo la compra
 * @param dia dia de la compra
 * @param monto monto de la compra
 * @constructor Crea una compra con cliente, dia y monto
 */
data class compra(var cliente:String , var dia:Int , var monto:Double){

}

/**
 * Clase Cliente
 * @param nombre nombre del cliente
 * @param domicilio domicilio del cliente
 * @constructor Crea un cliente con nombre y domicilio
 */
/*
data class cliente(var nombre:String , var domicilo:String){

    constructor(domicilo: String) : this(nombre, domicilo) {
    this.nombre = nombre
    }

}
*/




fun main(){
    val compras = listOf<List<Any>>(listOf("Nuria Costa", 5, 12780.78, "Calle Las Flores 355"),
    listOf("Jorge Russo", 7, 699, "Mirasol 218"),
    listOf("Nuria Costa", 7, 532.90, "Calle Las Flores 355"),
    listOf("Julián Rodriguez", 12, 5715.99, "La Mancha 761"),
    listOf("Jorge Russo", 15, 958, "Mirasol 218"))

}