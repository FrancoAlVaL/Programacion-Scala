//autor: Franco Álvarez Valcárcel
//codigo: u23240251
//fecha de creacion: 06/09/2026

import scala.io.StdIn.readLine

object Programa01 {
//crea una funcion
  def revisarTemperatura (T:List[Int],Min: Int, Max: Int ): Unit = {
//crea el iterador
    val iterador= T.iterator
    var FueraRango = false
//hace un bucle que comprueba y recorre las temperaturas
    while(iterador.hasNext) {
      val Temp= iterador.next()

      if (Temp < Min || Temp > Max){
        println("temperatura fuera de rango " + Temp)
        FueraRango= true
      }

    }
    if(FueraRango) {
      println("Alerta de estabilidad")
    }
  }
  //se crea la lista, se pide ingresar la temperatura minimi y maxima
  def main(args: Array[String]): Unit = {
    val Temp: List[Int] = List(15, 8, 25, 45, 32, 5)
    println("ingrese minimo")
    val min = readLine().toInt
    println("ingrese maximo")
    val max= readLine().toInt

    revisarTemperatura(Temp, min, max)

  }

}