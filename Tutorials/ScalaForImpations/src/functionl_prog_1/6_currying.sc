//Curring is the conversion of a function which takes two arguments into
// a function that takes one argument

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

