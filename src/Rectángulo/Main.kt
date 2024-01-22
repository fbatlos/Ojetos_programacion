package Rectángulo

import rectangulo
import java.lang.IllegalArgumentException

fun main(){
        val rectangulo1 = rectangulo(4.5, 5.3)
        val rectangulo2 = rectangulo(9.4, 1.2)
        val rectangulo3 = rectangulo(-8.0, 1.2)
        println(rectangulo1.toString())
        println(rectangulo2.toString())

}