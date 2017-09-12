//Numbers are objects, so you can invoke methods on them
1.to(10);
1.==(1)
1 to 10


//Scala uses java string with many methods.
"Hello".intersect("world")

//Variables are defined with name:Type
var someIntVariable:Int = 10;

//immutable definition
val someInt:Int = 100;

//variables can defined without type
val x:Int = 10;
val y = 20;
val z = "SomeStringValue";

//Bignumbers are easier to use in scala
val b:BigInt = 123232323;
b*b*b

scala.math.sqrt(5)
scala.math.abs(-5.10232)

//Scala has both functions and methods
//Functions does not operates on objects
//_ is used as a wildcard here
import scala.math._
sqrt(2); // This is a function
abs(-56.32)

//Methods operates on objects
BigInt.probablePrime(100,scala.util.Random)// This is a method


//Methods does not necessarily need () at end
//If you dont pass parameters to a method don't use them
"Hello".distinct
5.5.toString
"hello".length
22.56.toInt
// ( ) only required for mutators


//Apply method is a special methods can be called without the
// dot method name or parameters
//apply() method in string
"hello"(4) //
"hello".apply(4) //apply method is special so you can invoke them without the dot or method name
"ABCDEFGH"(2) //here there is no dot



