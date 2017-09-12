import java.util.function.Function

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


//Function Composition with higher order functions

val higherOrderFunction = (f: (String) => (Int)) => f(_:String) + 30;
val composingFunction = higherOrderFunction((x:String) => x.length)
println(composingFunction("ABCD"))


//Java and Scala higher order functions composition
// static Function<Function<Integer,Integer>,Function<Integer,Integer>>
// functionCompositionMultiplyByTwo = (f) -> f.andThen( (x) -> x *2);
//This is how you call it
//System.out.println(functionCompositionMultiplyByTwo.apply((x: Integer) => x * x).apply(10))

val functionMultiplyByTwo = (f: (Int) => (Int) ) => f(_:Int) * 2;
//This will still returns a function (And takes a function, similar to java andThen)
val returnedFunction = functionMultiplyByTwo( (x:Int) => x*x);
println(s"Ugly call ${returnedFunction(10)}")

//With Curring
println(s"Nice call ${ functionMultiplyByTwo((x:Int) => x*x) (10) }")

//The same thing can be achieved with producers
val producerFunction = () => (x:Int) => x*x*2;
println(s"anotherTest ${ producerFunction()(10) }")




































