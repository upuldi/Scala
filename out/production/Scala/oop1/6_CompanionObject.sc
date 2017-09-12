//Companion object
//Companion object is a class and the object of that class is in the same source file
//With the same name
//Usually the static methods can be included in the companion object
//Companion object has the access to the each others private members
//Companion objects are great for encapsulating things like factory methods.


//This is commonly used to create factory method to the class

class Point(val x:Int, val y:Int) { }

//This is the companion object
object Point {
  def apply(x:Int,y:Int) = new Point(x,y)
}

val pointWithClass = new Point(10,20)

//Here you are not using the new keyword as the factory method in the companion object
val pointWithCompanionObject = Point(10,20)