//autor: Franco Álvarez Valcárcel
//codigo: u23240251
//fecha de creacion: 06/09/2026

//se crea la clase Libro con los datos del titulo, autor y paginas
case class Libro(titulo: String, autor: String, paginas: Int)

object Programa04 {

  //se crea la funcion que recibe una lista de libros
  def procesarLibros(libros: List[Libro]): Unit = {

    //se filtran los libros que tienen menos de 200 paginas
    val cortos = libros.filter(libro => libro.paginas < 200)

    //se obtienen los titulos y se convierten a mayusculas
    val mayus = cortos.map(libro => libro.titulo.toUpperCase)

    //se agrega el prefijo "LECTURA CORTA:" a cada titulo
    val pre = mayus.map(titulo => "LECTURA CORTA: " + titulo)

    //se cuenta la cantidad de caracteres de cada titulo y se suman
    val conteo = pre.map(titulo => titulo.length).sum

    //se muestran los libros con menos de 200 paginas
    println("Libros con menos de 200 pg. " + cortos)

    //se muestran los titulos en mayusculas
    println("Libros con titulos en mayuscula: " + mayus)

    //se muestran los titulos con el prefijo
    println("Libros con el prefijo: " + pre)

    //se muestra el total de caracteres
    println("Conteo de caracteres: " + conteo)
  }

  //main para poder ejecutar el programa
  def main(args: Array[String]): Unit = {

    //se crea la lista de libros
    val libros = List(
      Libro("El Principito", "Antoine de Saint-Exupéry", 96),
      Libro("Don Quijote", "Miguel de Cervantes", 863),
      Libro("1984", "George Orwell", 328),
      Libro("El viejo y el mar", "Ernest Hemingway", 127)
    )

    //se llama a la funcion enviando la lista de libros
    procesarLibros(libros)
  }
}