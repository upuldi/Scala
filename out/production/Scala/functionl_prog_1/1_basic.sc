//Functions are first class citizons
var variable = 2.3d

//Functions can be assigned to variables and can be invoked
var function = toString

def someFunction(str:String): String = {
  return s"received a string ${str}"
}

//As it java scripts inorder to invoke a function use ()
val someFunctionCall = someFunction("First class functions")
println(someFunctionCall)

//Annonymous functions = (parameter:type) => function
//For ex function which return a product
val productAnnonymousFunction = (x:Int) => x*x

//this above function will take x argument of int and return its product
productAnnonymousFunction(5)

val anotherFunction = (x:Int) => x + 10


//Only recursive functions are needed to defined with def notation,
//All other functions can be defined as annonymous functions
//So give a function a name only if you need the function many times

val anotherAnnonymousFunction = (x:Double) => x*x

//When a function accepting another function
// function = (f : (input type) => (output type)) => body
val functionEatingFunction = (f: (Double) => Double) => f(20)
functionEatingFunction(anotherAnnonymousFunction)