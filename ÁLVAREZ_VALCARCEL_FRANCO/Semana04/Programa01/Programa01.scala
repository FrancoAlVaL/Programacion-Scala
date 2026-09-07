//autor: Franco Álvarez Valcárcel
//codigo: u23240251
//fecha de creacion: 06/09/2026

//se crea la clase Libro04 con los datos del titulo, autor y paginas
case class Libro04(titulo: String, autor: String, paginas: Int)

object Programa07 {

  //se crea la funcion que recibe una lista de libros
  def procesarLibros(libros: List[Libro04]): Unit = {

    //se filtran los libros que tienen menos de 200 paginas
    val cortos = libros.filter(libro => libro.paginas < 200)

    //se obtienen los titulos y se convierten a mayusculas
    val mayus = cortos.map(libro => libro.titulo.toUpperCase)

    //se agrega el prefijo a cada titulo
    val pre = mayus.map(titulo => "LECTURA CORTA: " + titulo)

    //se calcula la cantidad total de caracteres
    val conteo = pre.map(titulo => titulo.length).sum

    //se muestran los titulos procesados
    pre.foreach(println)

    //se muestra el total de caracteres
    println("Conteo de caracteres: " + conteo)
  }

  //main para poder ejecutar el programa
  def main(args: Array[String]): Unit = {

    //se crea la lista de libros
    val libros = List(
      Libro04("El Principito", "Antoine de Saint-Exupéry", 96),
      Libro04("Don Quijote", "Miguel de Cervantes", 863),
      Libro04("1984", "George Orwell", 328),
      Libro04("El viejo y el mar", "Ernest Hemingway", 127)
    )

    //se llama a la funcion enviando la lista de libros
    procesarLibros(libros)
  }
}