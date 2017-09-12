//Curring is the conversion of a function which takes two arguments into
// a function that takes one argument
//Benefits are
//Provides syntatic sugar, reuse of more abstract functions

def multiplyTwo(x:Int, y:Int) = x * y
def multiplyWithOneArgument(x:Int) = (y:Int) => x*y
multiplyWithOneArgument(10)(20)

//Scala provides some syntactic sugar to this
def easyCurring(x:Int)(y:Int) = x*y
easyCurring(10)(20)

val a = Array("HELLO","WORLD")
val b = Array("hello","world")

a.corresponds(b)(_.equalsIgnoreCase(_))
a.corresponds(b) ( (x:String,y:String) => x.equalsIgnoreCase(y)  )

//Curring Practice
val multiplyer = (x:Int,y:Int) => x*y
val multiSingle = (x:Int) => (y:Int) => x * y
multiplyer(100,2)
multiSingle(10)(20)
//So here the single argument function returns another function which returns
// the multiplied value

//Currying is the operation of taking a function,
// which accepts multiple arguments all at once,
// and turning that function into another function
// which takes only the first argument and returns another
// function which will take the second argument,
// which will return another function to
// take the next argument up until you run out of the arguments.
// Only then the last function will return the result.


val addTwoNumbers = (x:Int,y:Int) => x + y
val sum = (x:Int) => (y:Int) => x + y

addTwoNumbers(5,10)
sum(5)(10)

//Scala Specific syntactic sugar
def multiply(x:Int)(y:Int) = x*y
multiply(10)(5)
