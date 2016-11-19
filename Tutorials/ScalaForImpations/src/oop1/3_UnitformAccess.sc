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


//Complete Example

class Score(val maths:Int,var science:Int) {

  def multiplyByTwo = new Score(maths*2,science*2)
  override def toString = f"x is ${maths} and y is ${science}"
}

val instanceA = new Score(10,20)
instanceA.maths
instanceA.science = 100

//This is the same class as above but instance variables have been removed
//without impacting the out side world

class ScoreBetterWay(val a:Int,val b:Int) {

  //Accessor methods
  def maths = a
  def science = b

  //ToProvide mutable setters
  // def property_=(newValue:Type) = {}
  def science_=(newValue:Int) = { science = newValue}


  //No body knows that the x and y have been changed from instance variables
  //to methods
  def multiplyByTwo = new Score(maths*2,science*2)
  override def toString = f"x is ${maths} and y is ${science}"
}

val instanceB = new ScoreBetterWay(10,20)
instanceB.maths

//Mutating the property
instanceB.science = 100