class robot (){
     // Hacer los set y get , metodo movimiento y el retun en toString.
    private var nombre:String = ""
    fun nombrerobot(){
       var comprobante = false
        do {
           print("Dime tu nombre => ")
           nombre = readln()
            if (nombre == ""){
                println("Nombre no valido")
            }else comprobante = true

       }while (!comprobante)
    }
    private var movs: List<String> = " , ".split(",")
    private var pos_x: Int = 0

    private var pos_y:Int = 0

    private var cont:Int = 0

    private var direccion: String = ""
    fun movimiento() {
        print("Dime como me tengo que mover $nombre => ")
        this.movs = readln().split(",")
        while (this.cont < this.movs.size) {
            when (cont) {
                0 -> {
                    if (this.cont % 2 == 0) {
                        this.pos_y += this.movs[cont].toInt()
                    }
                    direccion = "Negative X"
                }

                1 -> {
                    if (this.cont % 2 == 1) {
                        this.pos_x -= this.movs[cont].toInt()
                    }
                    direccion = "Negative Y"
                }

                2 -> {
                    if (this.cont % 2 == 0) {
                        this.pos_y -= this.movs[cont].toInt()
                    }
                    direccion = "Positive X"
                }

                3 -> {
                    if (this.cont % 2 == 1) {
                        this.pos_x += this.movs[cont].toInt()
                    }
                    direccion = "Positive Y"
                }

                4 -> {
                    if (this.cont % 2 == 0) {
                        this.pos_y += this.movs[cont].toInt()
                    }
                    direccion = "Negative X"
                }

                else -> {}
            }
            this.cont++
        }
    }

    override fun toString(): String {
        return "${nombre} estas en x: ${pos_x}, y: ${pos_y}, direction: ${direccion}"
    }
}



fun main(){
    try {
        val robot = robot()
        robot.nombrerobot()
        robot.movimiento()
        println(robot.toString())
    }catch (_:NumberFormatException){
        println("*ERROR*")
    }
}


