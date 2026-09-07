//autor: Franco Álvarez Valcárcel
//codigo: u23240251
//fecha de creacion: 06/09/2026
import scala.io.StdIn.readLine


object Programa02 {
//se crea la funcion con un map y nombre de producto a buscar como parametros
  def buscarProducto( catalogo: Map[String, Double] , productoBuscado: String) : Unit = {
   //se crea el iterador que va a recorrer el map
    val iterador= catalogo.iterator
    //se crea una variable que nos ayudará a saber si se encontró el producto
    var encontrado= false
    //se hace el bucle recorriendo el map buscando el producto
    while (iterador.hasNext) {
      val (nombre, precio) = iterador.next()
      if(nombre==productoBuscado){
        println("El precio de " + nombre + " es $"+precio )
        encontrado= true
        }
      }
    //si no se encuentra, retorna un mensaje
    if (!encontrado) { println("Producto no encontrado en el catálogo actual") }

    }

  //main con el map insertado y con la funcion a ejecutar
  def main(args: Array[String]): Unit = {
    println("ingrese nombre del producto")
    val productoBuscado= readLine
    val catalogo: Map[String, Double] = Map (
      "laptop" -> 2500.0,
      "mouse" -> 80.0 ,
      "teclado" -> 120.0,
      "monitor"-> 900.0
    )
    buscarProducto(catalogo, productoBuscado)
  }
}

