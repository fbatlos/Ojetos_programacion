package `31-01-2024`

data class Tarea(val  dec:String)

class Gestion{
    lateinit var tarea: List<Tarea>

    fun inicializarTarea(tarea: List<Tarea>){
        this.tarea = tarea
    }

    fun mostrarTarea(){
        if (::tarea.isInitialized){
            tarea.forEach { tarea ->
                println(tarea.dec)
            }
        }else println("NO")

    }

}

fun main(){
    val gestion = Gestion()
    gestion.mostrarTarea()
    val tareas = listOf<Tarea>((Tarea("hola")), Tarea("YES"))

    gestion.inicializarTarea(tareas)//saber como es

}
/***************************************************************************
 * HERENCIA
 *
 * solo se puede hederar 1 vez entre clases pero se puede heredar 1 o ++ con intarface
 */

open class Base{
    open fun v():String{
        return "DESPIERTA"
    }
}

class Hija:Base(){
    override fun v(): String {
        return super.v()
    }

    //final
}
///////////////////////////////////////////////////////////////////////////////////////////////////////Initerface por defecto es un open
open class A {
    open fun f() { print("A") }
    fun a() { print("a") }
}

interface B {
    fun f() { print("B") } // interface members are 'open' by default
    fun b() { print("b") }
}

class C() : A(), B {//la clase C que hereda de A y tiene un interface B
    // El compilador requiere que 'f()' sea sobreescrito para eliminar la ambigüedad
    override fun f() {
        super.a()
        super.b()
        super<A>.f() // call to A.f()
        super<B>.f() // call to B.f()
    }
}
///////////////Otro prueba
open class D {
    open fun foo(i: Int = 10) { }
}

class E : D() {
    override fun foo(i: Int) { }  // no default value allowed
}



