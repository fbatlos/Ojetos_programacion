package Coche

fun main(){

    val coche1 = coche()
    coche1.setColor(null)
    coche1.setMarca("Renol")
    coche1.setModelo("777P")
    coche1.setNcaballos(60)
    coche1.setNpuertas(4)
    coche1.setMatricula("1234547ADS")

    val coche2 = coche()
    coche2.setColor("Verde")
    coche1.setMarca("LOL")
    coche1.setModelo("SINSX")
    coche1.setNcaballos(600)
    coche1.setNpuertas(45)
    coche1.setMatricula("8869697PAN")

    println(coche1.toString())
    println(coche2.toString())

    println("Se estan cambiando los colores.......(press enter)")
    readln()

    coche1.cambiarColor()
    coche2.cambiarColor()
    println(coche1.toString())
    println(coche2.toString())
}