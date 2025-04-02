ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.15"

lazy val root = (project in file("."))
  .settings(
    name := "introduccion_scala"
  )
//libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.16" % Test
//libraryDependencies += "com.typesafe" % "config" % "1.4.3"
// Para no duplicar la clave se puede hacer de la siguiente manera

libraryDependencies ++= Seq(
  "org.scalatest" %% "scalatest" % "3.2.16" % Test, //Aplica el doble %% por que es una libreria de SCALA y usa la version correcta
  "com.typesafe" % "config" % "1.4.3" // No aplica %% poorque no es una libreria de Scala si no de JAVA

)