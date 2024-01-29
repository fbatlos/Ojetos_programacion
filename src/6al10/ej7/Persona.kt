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
                cuentas += Cuenta(readln(), readln().toDouble())
            }else{
                println("Ya has llenado las 3 cuentas disponibles.")
            }
        }catch (_:Exception){
            print("Dato no valido")
        }
    }


}