import scala.io.Source

object TiendaApp extends App{
  //Como se carga un fichero en scala
  //--python
  // with open (x ,r ) as f:
  // f.read()
  //--python

  val src = Source.fromResource("tienda/productos.csv")
  //MODO1
  //val src2 = Source.fromFile("/path del fichero con ruta absoluta")
  //src2.close()
  //MODO2
  val lineFromSource = src.getLines().toList// quitamos cabecera
  val total = lineFromSource.tail.map
    { l =>
      val parts = l.split(",")
      val price = parts(2).toDouble // pos 0 ,1, , -> 2
      val stock = parts(3).toInt // pos 0 ,1 , 2 , -> 3
      (price, stock) // (0.5,100)
    }
    .map { case (price, stock) => price * stock }
    .sum // suma todos los valores 50.0 + 60.0
  println(s"El total es: $total")
  src.close()
}
//Ejemplo todo en una linea
//val total = src.getLines().toList.tail.map(_.split(",")).map(p => p(2).toDouble * p(3).toInt).sum
