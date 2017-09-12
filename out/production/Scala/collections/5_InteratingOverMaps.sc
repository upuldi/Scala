// Map iteration is similar to a loop iteration, but with two fields

val someMap = Map("x" -> 10, "y" -> 20 , "z" -> 30)
for( (a,b) <- someMap ) println("key : " + a + " and value is : " + b)


//Yield can be used to obtain a new map
//Here key values were shifted to create a new map
// yield usually provides the same collection type that it iterate over
val anotherMap = for( (a,b) <- someMap ) yield (b,a)
anotherMap

//Yielding example
val mapYield = Map(10 -> "A", 20 -> "B", 30 -> "C")
val newMap = for ( (x,y) <- mapYield) yield (x*x,y)
println(newMap)