object Main extends App {
  println("Hola Scala con Sbt¡")
  println(s"El servidor es: ${SampleConfig.server}")
  println(s"El puerto es: ${SampleConfig.port}")
  println(s"Las estaciones son: ${SampleConfig.asScalaList}")
}
