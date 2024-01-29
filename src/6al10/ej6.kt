package `6al10`
data class Compra(var cliente: String, var dia: String, var monto: String, var domicilio: String){
   //no sé porque no me funciona el data class
}

data class Cliente(var nombre: String, var domicilio: Domicilio){
    //Antes no me funcionaba
}

data class Domicilio(var domicilio: String, var numero: String){

    fun dirCompleta(){
        println("Domicilio : $domicilio , Nº : $numero")
    }
}

class RepositorioCompras(var comprasData: List<Unit>) {




}

fun main() {
    val comprasData = listOf(
        listOf("Nuria Costa", "5", "12780.78", "Calle Las Flores", "355","3"),
        listOf("Jorge Russo", "7", "699", "Mirasol", "218","2"),
        listOf("Nuria Costa", "7", "532.90", "Calle Las Flores", "355","16"),
        listOf("Julián Rodriguez", "12", "5715.99", "La Mancha", "761" , "25"),
        listOf("Jorge Russo", "15", "958", "Mirasol", "218"," ")
    )
    val compras: List<Unit> = comprasData.map {
        Compra(it[0], it[1], it[2], it[3])
        val domicilio = Domicilio(it[3] , it[5])
        Cliente(it[0] , domicilio)
    }
    println(compras)

}
