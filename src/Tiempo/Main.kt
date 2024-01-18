package Tiempo

fun main(){
    var tiempo1 = tiempo()
    var pedirnum:String
    var cont = 1


        try {
            do {
                when (cont) {
                    1 -> {
                        print("horas => ")
                        pedirnum = readln()
                        if (pedirnum == "") {
                            tiempo1.hora = 0
                        } else tiempo1.hora = pedirnum.toInt()
                    }

                    2 -> {
                        print("minutos => ")
                        pedirnum = readln()
                        if (pedirnum == "") {
                            tiempo1.minuto = 0
                        } else tiempo1.minuto = pedirnum.toInt()
                    }

                    3 -> {
                        print("segundos => ")
                        pedirnum = readln()
                        if (pedirnum == "") {
                            tiempo1.segundo = 0
                        } else tiempo1.segundo = pedirnum.toInt()
                    }
                }
                cont++
            }while (cont!=4)
            tiempo1.comprobar()
            tiempo1.actualizarResultado()
            println(tiempo1.toString())
        } catch (_:NumberFormatException){
                println("Dato invalido")
        }

}
