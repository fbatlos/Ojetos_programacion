package `6al10`.ej7

import java.lang.Exception


class Persona(DNI : String, var cuentas:Array<Cuenta?> = Array(3) {null}) {
    var DNI:String = DNI
        set(value) {
            require(DNI == "" || DNI.length != 9 ){ " DNI no valido"}
            field = value
        }

    fun añadirCuenta(){
        try {
            if (cuentas.indexOf(null) != -1){
                println("Dime tu numcuenta.")
                cuentas += Cuenta(readln(),234.5)//readln(), readln().toDouble())
            }else{
                println("Ya has llenado las 3 cuentas disponibles.")
            }
        }catch (_:Exception){
            print("Dato no valido")
        }
    }


    fun transferencia(cuentaOrigen:String,cuentaDestinatario:String ,cantida:Double = 1.0){
        val cuentaEnvia = this.cuentas.find { (it?.numCuenta ?: -1) == cuentaOrigen }
        val cuentaReceptora = this.cuentas.find { (it?.numCuenta ?: -1) == cuentaDestinatario }
        cuentaEnvia?.realizarPagos(cantida)
        cuentaReceptora?.abonos(cantida)
        cuentaEnvia?.saldoDisponible()

    }

}