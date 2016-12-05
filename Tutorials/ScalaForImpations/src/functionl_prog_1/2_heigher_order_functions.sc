// A function consumes another function, it is called a higher order function
// Some function have function parameters
def afunctionConsumesAnotherFunction(f:(Double) => Double) = f(2)
//Function Type parameter declaration
// parameter:Function Type
// parameter: (Input) => OutPut

afunctionConsumesAnotherFunction((x:Double) => x*x)


//Example
def higherOrderFunction(f:(Int) => Int): Double = {
  //This function accepts any function which takes a Int and returns a Int
  //Here basically we are calling the passing function inside this function
  return f(10)
}
val annonymousFunctionHolder = (x:Int) => x+5

higherOrderFunction(annonymousFunctionHolder)


//Another example
def myTestHigherOrderOne(f:(Int) => String): String = {

  println("Higher order function called....")
  f" Higher order says ${f(100)}"

}

def passingFunction(x:Int):String = {

  println("Inside passing function....")
  f"passing function logic is ${x+10}"

}

myTestHigherOrderOne(passingFunction)

//A higher order function in annonymous way
val holder = (f: (Double) => Double ) => f(10)
holder((x:Double) => x*x)
