//autor: Franco Álvarez Valcárcel
//codigo: u23240251
//fecha de creacion: 06/09/2026

object Programa09 {

  //se crea la funcion que recibe un mapa con productos y precios
  def procesarProductos(productos: Map[String, Double]): Unit = {

    //se filtran los productos que tienen un precio mayor a 50
    val mayores = productos.filter {
      case (producto, precio) => precio > 50
    }

    //se aplica un descuento del 20% a los precios
    val rebajados = mayores.map {
      case (producto, precio) => (producto, precio * 0.80)
    }

    //se cambia cada producto al formato solicitado
    val formato = rebajados.map {
      case (producto, precio) =>
        "Producto: " + producto.toUpperCase +
          " | Precio Rebajado: $" + precio
    }

    //se obtienen solamente los precios rebajados
    val precios = rebajados.values.toList

    //se calcula el promedio de los precios rebajados
    val promedio = precios.sum / precios.size

    //se muestran los productos procesados
    formato.foreach(println)

    //se muestra el promedio de los precios
    println("Precio promedio rebajado: $" + promedio)
  }

  //main para poder ejecutar el programa
  def main(args: Array[String]): Unit = {

    //se crea el mapa con los productos y sus precios
    val productos: Map[String, Double] = Map(
      "laptop" -> 2500.0,
      "mouse" -> 30.0,
      "teclado" -> 120.0,
      "monitor" -> 900.0,
      "audifonos" -> 45.0
    )

    //se llama a la funcion enviando el mapa de productos
    procesarProductos(productos)
  }
}
