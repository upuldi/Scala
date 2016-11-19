//Numbers are objects, so you can invoke methods on them
1.to(10);

//Scala uses java string with many methods.
"Hello".intersect("world")

//Bignumbers are easier to use in scala
val b:BigInt = 123232323;
b*b*b



//Scala has both functions and methods
//Functions does not operates on objects
import scala.math._
sqrt(2); // This is a function

//Methods operates on objects
BigInt.probablePrime(100,scala.util.Random)// This is a method


//Methods does not necessarily need ()
//If you dont pass parameters to a method don't use them
"Hello".distinct
5.5.toString
"hello".length
// ( ) only required for mutators

//Some special methods can be called without the method name or parameters
//apply() method in string
"hello"(4)
"hello".apply(4) //apply method is special so you can invoke them without the dot or method name



