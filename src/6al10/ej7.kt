package `6al10`

import kotlin.random.Random

class Cuenta(var numCuenta: String , var saldo:Double) {
    fun saldoDisponible(){
        println("Tu saldo es de : $saldo")
    }

    fun abonos(){
        print("Cuanto desea ingresar => ")
        do {
            try {
                val ingreso = readln().toDouble()
                saldo += ingreso
                break

            }catch (_:NumberFormatException){
                println("Dato no valido")
            }
        }while (true)
    }

    fun realizarPagos(){
        do {
            println("Que pagos quieres realizar :\n(1)Gastos del hogar.\n(2)Bizum")
            print("=> ")
            val opcion = readln()
            when (opcion){
                "1" -> { val situacion = Random.nextInt(1,3)
                        val gasto:Int
                        when(situacion){
                            1->{
                                gasto = Random.nextInt(500,1000)
                                println("Gastos de casa , son : $gasto")
                                saldo -= gasto.toDouble()
                            }
                            2->{
                                gasto = Random.nextInt(10,200)
                                println("Gastos de comida , son : $gasto")
                                saldo -= gasto.toDouble()
                            }
                            3->{
                                gasto = Random.nextInt(50,100)
                                println("Sea roto algo en casa , son : $gasto")
                                saldo -= gasto.toDouble()
                            }
                        }

                }

                "2" -> {
                    try {
                        val receptor = readln()
                        val cantidad = readln().toDouble()
                        saldo -= cantidad
                        println("Le has enviado a $receptor un importe de $cantidad")
                    }catch (_:NumberFormatException){
                        println("Algo ha salido mal...")
                    }
                }
            }
        }while (true)
    }
}


class Persona(val DNI : String , val cuentas:List<String>) {

    fun añadirCuenta(){
        do {
            print("")

        }while (true)
    }



}