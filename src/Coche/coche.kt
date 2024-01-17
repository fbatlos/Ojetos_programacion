package Coche

import java.awt.Color

class coche {
    private var color = ""
    fun getColor(): String {
        return this.color
    }
    fun setColor(color: String) {
            this.color = color
        }

    private var marca = ""
    fun getMarca(): String {
        return this.marca
    }
    fun setMarca(marca: String) {
        this.marca = marca
    }

    private var modelo = ""
    fun setModelo(modelo: String) {
        this.modelo = modelo
    }
    fun getModelo(): String {
        return this.modelo
    }
    private var Ncaballos = 0


    fun setNcaballos(Ncaballos:Int) {
            if (this.Ncaballos<70 || this.Ncaballos>700){
                this.Ncaballos = 0
            }else this.Ncaballos = Ncaballos
        }

    fun getNcaballos(): Int {
        return this.Ncaballos
    }
    private var Npuertas = 0

    fun setNpuertas(Npuertas: Int) {
            this.Npuertas = Npuertas
        }

    fun getNpuertas():Int {
       return this.Npuertas
    }
    private var matricula = ""

    fun  setMatricula(matricula:String) {
            this.matricula = matricula
    }

    fun getMatricula(): String {
        return this.matricula
    }

    fun cambiarColor(){
        val nums = 0..6
        val randomNum = nums.random()

        when (randomNum){
            0 -> this.color = "Rojo"
            1 -> this.color = "Azul"
            2 -> this.color = "Verde"
            3 -> this.color = "Negro"
            4 -> this.color = "Blaco"
            5 -> this.color = "Naranja"
            6 -> this.color = "Gris"
        }



    }
    override fun toString(): String {
        return "Tienes un $marca $modelo de color $color con $Npuertas puertas , $Ncaballos caballos y la matricula es $matricula"
    }
}