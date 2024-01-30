package `6al10`

import `30-01-2024`.persona
import `6al10`.ej7.Cuenta
import `6al10`.ej7.Persona

fun main(){
    println("Dime DNI.")
    val persona1 = Persona(readln())
    /*
    val cuenta1  = Cuenta("12345677" , 123.4)
    cuenta1.saldoDisponible()
    cuenta1.abonos()
    cuenta1.realizarPagos()
    cuenta1.saldoDisponible()
    */
    persona1.añadirCuenta()


    println("Dime DNI.")
    val persona2 = Persona(readln())
    persona2.añadirCuenta()

    println("Dime la cantidad")
    persona1.transferencia("12345","asd", readln().toDouble())

}