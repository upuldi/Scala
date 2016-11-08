//In Scala Conditional Statement has a value
val x = 10
if (x>5) 20 else 30

//Since it has a value you can assign it to a variable
val y = if (x > 5) 20 else 30

//If different types are returned from the if and else statements
// the target type would be the common ancestor of the both types.
val k:Any = if (x>10) "String" else 100;

//Here the value is Unit, It represent the void in java
//but in Scala void has a value
val voidDemo = if (x>100) "Something"

//Also scala has value blocks,
val someValueBlockDemo = {

  val valOne = 100*10
  val valTwo = 200*10
 //Value of a value block will be the result of the last expression.
  valOne * valTwo
}