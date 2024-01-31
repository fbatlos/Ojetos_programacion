package `31-01-2024`

import `30-01-2024`.contacto


class Domicilio(var calle:String,var numero:Int){
    override fun toString(): String {
        return "$calle , $numero"
    }
}


class Contacto(var nombre : String ,  var telefono : Int , val domicilio: Domicilio) {


    override fun toString(): String {
        return "$nombre $telefono"
    }

}

class Agenda(var desc : String){

    val contactos = mutableListOf<Contacto>()

    fun agregarContacto(contacto: Contacto) {
        contactos.add(contacto)
        total++
    }

    fun eliminarContacto(contacto: Contacto) {
        contactos.remove(contacto)
        eliminado++
    }

    companion object {
        private var total = 0

        private var eliminado = 0
        fun mostrarTotal() = total

        fun contactosEliminados() = eliminado
    }
}


fun main(){
    val agenda = Agenda("Agenda personal") //sin companion objet
    val agendatra = Agenda("Trabajo")


    val contacto1 = Contacto("Fran" ,12, Domicilio("dolores" , 2))
    //Agenda.agregarContacto(contacto1)

   agenda.agregarContacto(contacto1) //sin companion objet

    val contacto2 = Contacto("Andre" ,6662, Domicilio("dolores" , 2))

    agendatra.agregarContacto(contacto2)

    agendatra.eliminarContacto(contacto2)

    println(Agenda.contactosEliminados())
}