//Map applies a function to the each element of a sequence
(1 to 9).map(10 * _)
(1 to 9).map( (x:Int) => x * 100)

//Filter retails the elements fulfilling a predicate
(1 to 9).filter( _ % 2 == 0 )
(1 to 9).filter((x:Int) => x % 2 == 0 )

//Reduce left can be used to apply a function into a nabouring elements of a collection or a sequence
//reduceLeft applies a binary function with two arguments,
// going from left to right
(1 to 5).reduceLeft(_ + _)
(1 to 9).reduceLeft(_ * _)
(1 to 9).reduceLeft( (x:Int,y:Int) => x*y  )


//Map is the exactly the same thing as the for yield
//Filter is the guard condition of the for yield
(1 to 9).filter(_ % 2 == 0).map(_ * 10)
for(x <- 1 to 9; if x % 2 == 0) yield x * 10


//Various ways map function can be written into
(1 to 9).map((x:Int) => x * 10)
(1 to 9).map(x => x * 10)
(1 to 9).map( _ * 10)

//Also consider the following scenario
def someFunction(x:Int):Int = {
  x * 5
}

//Various vays of writing the map function
(1 to 9).map(x => someFunction(x))
(1 to 9).map(_ => someFunction(_))
(1 to 9).map(someFunction(_))
//If the arguments are so obvious you can ommit them
(1 to 9).map(someFunction)

//This kind of notation is only applicable when you are calling another function
//Like in Java

val consumerFunction = (f: (Int) => (String)) => f(_) * 10
val exNormal = consumerFunction( (x:Int) => x.toString )
val exWithOutTypes = consumerFunction(x => x.toString)
val exUnderscore = consumerFunction(_ => toString)
val tooShortNotation = consumerFunction(_.toString)
