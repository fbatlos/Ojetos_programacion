package `6al10`.ej7

import kotlin.random.Random

class Cuenta( numCuenta: String , saldo:Double = 0.0 ) {
    var numCuenta:String = numCuenta
        set(value) {
            require(numCuenta == ""){"Numero de cuenta no valido "}
        }
    var saldo:Double = saldo
        set(value) {
            if (value < 0 ){
                print("persona morosa")
            }
        }

    fun saldoDisponible() {
        println("Tu saldo es de : $saldo")
    }

    fun abonos(saldoAbonado: Double){
        try {
            this.saldo += saldoAbonado

        }catch (_:NumberFormatException){
            println("Dato no valido")
        }
    }

    fun realizarPagos(pago:Double){
       /* do {
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
                            this.saldo -= gasto.toDouble()
                            break
                        }
                        2->{
                            gasto = Random.nextInt(10,200)
                            println("Gastos de comida , son : $gasto")
                            this.saldo -= gasto.toDouble()
                            break
                        }
                        3->{
                            gasto = Random.nextInt(50,100)
                            println("Sea roto algo en casa , son : $gasto")
                            this.saldo -= gasto.toDouble()
                            break
                        }
                    }

                }

                "2" -> {
                    try {
                        val receptor = readln()
                        val cantidad = readln().toDouble()
                        this.saldo -= cantidad
                        println("Le has enviado a $receptor un importe de $cantidad")
                        break
                    }catch (_:NumberFormatException){
                        println("Algo ha salido mal...")
                    }
                }
            }
        }while (true)*/
        try {
            saldo -= pago
        }catch (_:NumberFormatException){
            println("Dato no valido")
        }
    }
}