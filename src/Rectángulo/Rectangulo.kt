
import kotlin.math.pow
import kotlin.math.roundToInt
import kotlin.math.sqrt
import kotlin.time.times

class rectangulo(var base: Double , var altura:Double) {
    var area:Double
    var perimetro:Double

    init {
        require(this.base>0 && this.altura>0){"No valido"}
        area = base * altura
        perimetro = base.pow(2) + altura.pow(2)
    }

    override fun toString(): String {
        return ("Su altura es de $altura cms y su base es de $base cms y el resultado del area es ${(area*100.0).roundToInt()/100.0} cms y el resultado del ${(perimetro*100.0).roundToInt()/100.0} cms")
    }
}