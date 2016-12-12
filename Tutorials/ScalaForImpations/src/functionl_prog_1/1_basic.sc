//Functions are first class citizons
var variable = 2.3d

//Variable to keep a function
var function = toString

//As it java scripts inorder to invoke a function use ()


//Annonymous functions
//(parameter:type) => function
//For ex function which return a product
val productAnnonymousFunction = (x:Int) => x*x

//this above function will take x argument of int and return its product
productAnnonymousFunction(5)

val anotherFunction = (x:Int) => x + 10


//Only recursive functions are needed to defined with def notation,
//All other functions can be defined as annonymous functions
//So give a function a name only if you need the function many times

val anotherAnnonymousFunction = (x:Double) => x*x
val functionEatingFunction = (f: (Double) => Double) => f(20)
functionEatingFunction(anotherAnnonymousFunction)