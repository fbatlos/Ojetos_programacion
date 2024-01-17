
import kotlin.math.pow
import kotlin.math.roundToInt
import kotlin.math.sqrt
import kotlin.time.times

class rectangulo(var base: Double , var altura:Double) {
    var area:Double
    var perimetro:Double

    init {
        area = base * altura
        perimetro = base.pow(2) + altura.pow(2)
    }

    fun mostrarResultados(){
        println("Su altura es de $altura y su base es de $base y el resultado del area es ${(area*100.0).roundToInt()/100.0} y el resultado del ${(perimetro*100.0).roundToInt()/100.0}")
    }
}