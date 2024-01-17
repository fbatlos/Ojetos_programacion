class persona( var nombre: String,var peso: Double , var altura: Double ) {
    var imc : Double = 0.0

    init {
        imc = peso /(altura * altura)
    }
    /*constructor( peso: Double , altura: Double, nombre: String): this(nombre){
        this.peso = peso
        this.altura = altura
    }
*/


    constructor(nombre: String , peso: Double , altura: Double):this(peso,altura){
        print("Quieres cambiar el nombre ${nombre} si/no? ")
        val comprobante=readln()
        if (comprobante == "si"){
            print("Pon un nombre: ")
            this.nombre = readln()
        }else this.nombre = nombre
    }

}