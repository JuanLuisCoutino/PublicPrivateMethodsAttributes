
class Automoviles(){

    private var color = ""
    private var modelo = 0
    private var marca = ""
    private var acceso = false

    public fun meterLLave(llave : String){
        if (llave=="123456"){
            acceso = true
            println("Tienes acceso al automovil")
        }else{
            println("Llave incorrecta *encender alarma*")
        }
    }

    public fun mando(accion: String){
        if (acceso==true){
            if (accion=="encender"){
                encender()
            }
        }else{
            println("Llave incorrecta")
        }
    }
    private fun encender(){
        println("El auto enciende por boton")
    }
    private fun arranca(){
        println("El auto arranca en Directa")
    }

    private fun frena(){
        println("El auto frena con el pedal")
    }
    private fun apaga(){
        println("El auto se apaga por boton")
    }
}

var bmwx6 = Automoviles()
bmwx6.meterLLave("123456")
bmwx6.mando("encender")
