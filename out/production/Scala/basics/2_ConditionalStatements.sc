//In Scala Conditional Statement has a value
val x = 10
val y = 20

//Since it has a value you can assign it to a variable
val z = if (x > y) 100 else 200

//If different types are returned from the if and else statements
// the target type would be the common ancestor of the both types.
val k:Any = if (x>10) "String" else 100;
println(k)

val someAny = if (200 > 400) "Something" else true;
println(someAny)

//If the assignment doesn't return a value it will be of type Unit
val conditionalValue = if (x > y) "OnlyWhenX is greater"
println("Val for conditional : " + conditionalValue)

//Here the value is Unit, It represent the void in java
//but in Scala void has a value
val voidDemo = if (x>100) "Something"
print(voidDemo)

//Also scala has value blocks,
val someValueBlockDemo = {

  val valOne = 100*10
  val valTwo = 200*10
 //Value of a value block will be the result of the last expression.
  valOne * valTwo
}

val resultOfValueBlock = someValueBlockDemo

val anotherValueBlockExample = {
  //Can have variables inside
  val x = 10;
  val y = 300;
  x+y
}
println(anotherValueBlockExample * 2)