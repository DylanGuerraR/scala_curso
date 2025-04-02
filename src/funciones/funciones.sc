def printName(name: String, surname: String): Unit ={
  println(s"Mi nombre es: $name $surname")
}
printName(name = "charles", surname = "flores")

val triple = (i: Int) => i*3
println(triple(3))

val l = List(1,2,3,4)
l.map( x => triple(x))
l.map(triple(_)) // Se va aplicar la funcion triple a cada uno de los elementos de l

l.map( x => if ( x % 2 == 0) triple(x) else x)

//Funcion anidada

def function1(i: Int): Int = {
  def suma(i: Int, a: Int):Int = i + a
  suma( i = i, a = 10)
}
println(function1(5))
