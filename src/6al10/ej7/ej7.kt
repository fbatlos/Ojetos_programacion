package `6al10`

import `6al10`.ej7.Cuenta
import `6al10`.ej7.Persona

fun main(){
    val persona1 = Persona(readln())
/*
    val cuenta1  = Cuenta("12345677" , 123.4)
    cuenta1.saldoDisponible()
    cuenta1.abonos()
    cuenta1.realizarPagos()
    cuenta1.saldoDisponible()
    */

    persona1.añadirCuenta()
    persona1.añadirCuenta()
    persona1.añadirCuenta()
    persona1.añadirCuenta()
}