//Arrays are objects in scala
//[] denotes the type and () denotes the length of the array
// new Array[Type](length)
val numberArray = new Array[Int](10)
val scalaArray:Array[String] = new Array[String](2)
val shortArray = new Array[Int](3)


//In order to specify an array with initial values
//here type is inferred
//No new keyword is used
//probably due to companion object
val arrayWithInitialValues = Array("Hello","World")
val intArrayWithValues = Array(10,20,30)

//can use parantheses to access the elements
arrayWithInitialValues(0)
arrayWithInitialValues(1) = "Changed Value"
println(arrayWithInitialValues(1))
