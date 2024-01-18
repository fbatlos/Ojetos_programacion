class persona( var nombre: String,peso: Double ,  altura: Double ) {
    var peso = peso
        set(value){
            require(value>0){"EL "}
        }

    var altura = altura
    var imc : Double = 0.0

    init {
        imc = peso /(altura * altura)
    }
    constructor( peso: Double , altura: Double , nombre: String): this(nombre, peso, altura){
        this.nombre = nombre
        this.altura = altura
        this.peso = peso
    }

    fun saludar(){
        println("Hola ${this.nombre}")
    }

    fun  mostrarDesc(){
        var salud = ""
        if (imc < 18.5) salud = "peso insuficiente"
        if (imc>18.5 || imc<=24.9) salud = "peso saludable"
        if (imc>= 25.0 || imc<=29.9 ) salud  = "sobrepeso"
        if(imc>= 30.0) salud ="obesidad"
        println("${this.nombre} con una altura de ${this.altura}m y un peso ${this.peso}kg tiene un IMC de ${this.imc} [$salud]")
    }
}

