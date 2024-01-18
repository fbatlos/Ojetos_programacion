package Tiempo

class tiempo() {
    var hora = 0
    var minuto = 0
    var segundo = 0
    var result = ""


    fun comprobar(){//comprobaremos si en los diversos parametros llegan al 60
        if (segundo>59){
            minuto += segundo/60
            segundo %= 60
        }
        if (minuto > 59){
            hora += minuto/60
            minuto %= 60
        }
    }

    fun actualizarResultado(){//Actualizara el string resultado dependiendo si hemos rellenado o no los diferentes parametros
        if ((hora ?: 0) == 0){ result = "00 h"}
        if ((minuto ?: 0) == 0){result += " 00 m"}
        if ((segundo ?: 0) == 0){result += " 00 s"}
    }

    override fun toString():String {//retorna segun lo que tenga escrito en el resultado.
        when{
            result == "00 h 00 m 00 s" ->{ return result}
            result == "00 h 00 m" -> {return "$result $segundo s"}
            result == "00 h" -> {return "$result $minuto m  $segundo s"}
            result == " 00 m" -> {return "$hora h$result $segundo s"}
            result == " 00 m 00 s" -> {return "$hora h$result"}
            result == " 00 s" ->{return "$hora h $minuto m$result"}
            result == "" ->{return "$hora h $minuto m $segundo s"}
            result == "00 h 00 s" -> {return "00 h $minuto m 00 s"}
            else -> ""
        }
        return TODO("Provide the return value")
    }
}

/*
class tiempo {
    var hora = 0
    var minuto = 0
    var segundo = 0
    var result = ""

    fun comprobar() {
        minuto += segundo / 60
        segundo %= 60

        hora += minuto / 60
        minuto %= 60
    }

    fun actualizarResultado() {
        result = buildString {
            if (hora != 0) append("$hora h ")
            if (minuto != 0) append("$minuto m ")
            if (segundo != 0) append("$segundo s")
        }
    }

    override fun toString(): String {
        if (result.isBlank()) {
            return "00 h 00 m 00 s"
        }
        return result.trim()
    }
}
*/