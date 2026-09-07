//autor: Franco Álvarez Valcárcel
//codigo: u23240251
//fecha de creacion: 06/09/2026

import scala.io.StdIn.readLine

object programa03 {
//se crea la funcion con parametros de cantidades como una lista, y un umbral como entero
  def revisarStock( cantidades: List[Int], umbral: Int ): Unit = {
    //se crea el iterador que va a ser el encargado de poder recorrer
    val iterador= cantidades.iterator
//se realiza el bucle del recorrido en donde se va a estar comparando la cantidad y el umbral
    while(iterador.hasNext) {
      val cantidad= iterador.next()
//imprime la cantidad si esta es menor al umbral
      if(cantidad<umbral){
        println("se requiere reposicion inmediata, cantidad: "+ cantidad)

      }
    }
  }
//main para poder ejecutarlo
  def main(args: Array[String]): Unit = {
    val cantidades : List[Int] = List(51,30,15,2,9,20)
    println("ingrese el umbral")
    val umbral= readLine.toInt
    revisarStock(cantidades, umbral)

  }
}
