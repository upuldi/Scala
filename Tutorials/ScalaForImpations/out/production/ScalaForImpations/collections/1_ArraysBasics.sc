//Scala uses square brackets for the type and () for length
// new Array[Type](length)
val numberArray = new Array[Int](10)

//In order to specify an array with initial values
//here type is inferred
//No new keyword is used
val arrayWithInitialValues = Array("Hello","World")

//can use parantheses to access the elements
println(arrayWithInitialValues(0))
arrayWithInitialValues(1) = "Changed Value"
println(arrayWithInitialValues(1))
