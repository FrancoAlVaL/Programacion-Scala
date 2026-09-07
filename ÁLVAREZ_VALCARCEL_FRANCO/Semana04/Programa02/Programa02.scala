//autor: Franco Álvarez Valcárcel
//codigo: u23240251
//fecha de creacion: 06/09/2026

object Programa08 {

  //se crea la funcion que recibe un conjunto de hashtags
  def procesarHashtags(hashtags: Set[String]): Unit = {

    //se eliminan los espacios y se convierten los hashtags a minusculas
    val limpios = hashtags.map(hashtag => hashtag.trim.toLowerCase)

    //se filtran los hashtags que tienen 3 o mas caracteres
    val validos = limpios.filter(hashtag => hashtag.length >= 3)

    //se unen los hashtags utilizando una coma
    val resultado = validos.mkString(",")

    //se muestra el resultado final
    println("Hashtags procesados: " + resultado)
  }

  //main para poder ejecutar el programa
  def main(args: Array[String]): Unit = {

    //se crea el conjunto de hashtags
    val hashtags: Set[String] = Set(
      " Scala ",
      "#SCALA",
      " Programacion ",
      "#Java",
      "#a",
      "  #CODE  "
    )

    //se llama a la funcion enviando el conjunto de hashtags
    procesarHashtags(hashtags)
  }
}
