//Tuples holds values of different types
//Tuple contains array of different types where as arrays contains same types

/**
  * Tuples combined fixed number of items together so they can passed
  * together
  * unlike arrays, tuples can holds objects with different items
  * Tuples are immutable
  *
  */

val aTuple = (1,1.32223,"StingValue")
val aTupleOfThree = new Tuple3(1.21212,"Sting",13)
val aTupleOfTwo = new Tuple2(1.21212,"Sting")


//You can access an individual component in tuple with ._ operator
//Those are one indexed, not zero based
val firstPosition = aTuple._2
val secondPosition= aTuple._2

//pattern matching
//To create values based on the tuples\
//here the first value will not be created as a variable
val ( _, aa , bb) = aTuple
aa
bb

val tupleWithManyValues = (123,345,"String",12.2222,"anotherString")
val (_,_,firstString,_,secondString) = tupleWithManyValues
println(firstString)
println(secondString)



//Tuples are good to pass values from function
// when more than one value is passed from the function.
def someFunction(atuple:Tuple3[String]):Unit = {
  println(s"Input values from the tuple ${atuple._1} and ${atuple._2} and ${atuple._3} ")
}


//Looping a tuple containing ArrayBuffer
val symbols = Array("A","B","C")
val counts = Array(2,10,2)
val pairs = symbols.zip(counts)

for((aa,bb) <- pairs) print(aa + " *** " + bb + " **\n")
