//Class Definition

class MyFirstClassInScala(firstInstanceVariable:Int,
                          secondInstanceVariable:String) {

  def firstMethod(a:String,b:Int) = "First Method Executed"

  override def toString: String = "To String method has been overridden"
}

//This is how you create objects from the class and invoke instance methods
val someObjectFromTheClass = new MyFirstClassInScala(10,"First Object")
someObjectFromTheClass.firstMethod("Method",100)


//Another Class definition
class Point(val x:Double, var y:Double) {

  def move(nx: Double, ny: Double) = new Point(x+nx, y+ny)
  def distanceFromOrigin = math.sqrt(x*x + y*y)

  //Formatted String interpolation in Scala
  override def toString: String = f"(${x}), ${y}"
}

val aPoint = new Point(3,4)
aPoint.move(10,15)
aPoint.distanceFromOrigin

//Accessor methods are already provided
aPoint.x
aPoint.y
//This is possible if you defined the instance variables with var or val
// for ex, if you defined it without var or val like
// class myClass(x:Double,y:Double) you wont be able to access them

//aPoint.x = 100 //Here you will get an error as it is defined as a val, So You cant mutate it
aPoint.y=100 //Here you can mutate it as it is defined as var

