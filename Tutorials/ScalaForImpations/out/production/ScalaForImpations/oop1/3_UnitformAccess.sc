// In Scala there is no way of distinguishing a method without parameters
// and an Instance Variable
class SomeClass(val x:Int,val y:Int) {

  def someMethod = "Return a String output"
}

val instanceOfSomeClass = new SomeClass(10,20)

//All of these calls looks same, This is called Uniform Access
//User doesnt care whether it is an instance variable or a method which
// calculate the response
instanceOfSomeClass.someMethod
instanceOfSomeClass.x
instanceOfSomeClass.y

// This is why in Scala there is less fear about the public instance variables,
// As you can replace the variable with a method if you need to do so later
