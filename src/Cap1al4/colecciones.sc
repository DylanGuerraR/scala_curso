import scala.collection.immutable
import scala.collection.mutable.ListBuffer
// tuplas
//arrays
//seq
//conjuntos
//map

//tuplas

val t = ("a",1)
val t2 = (1,"b",0.3)

//acceder a los elementos de la tupla

t._1
t._2

// se puede guardar los datos
val y = t2._1
val y1 = t2._2
val y3 = t2._3

// La tupla solo puede aceptar hasta un maximo de 22 elementos, cuidado¡
val t3 = (y1,y)


//array
val simbolos = Array("<" ,"=" , ">")
val numeros = Array(10,20,30)

//operacion de enlace de tuplas

val zipped = simbolos.zip(numeros)
for (t <- zipped)
  println(t)

def dividePor10(n:Int): (Int , Int) = (n/10, n%10)

for (t <- zipped)
  println(dividePor10(t._2))

// 3 formas de generar una lista
val l = List(1, 2, 3, 4)
val l1 = 1::2::3::4::5::Nil
val l2 = List.range(1,6)// El valor final no se incluye en el range
val l3 = List(("<",1),("=",2),(">",3)) //Las listas tambien pueden contener tuplas


//calcular la suma de los elementos de una lista

var sum = 0










