//Mutation

class MyClass(x:Int,y:Int,z:String) {

  def myMethod(x:Int,y:Int) = {

    println("MyClass")
    //this.x = x
    //Cant mutate the object because the instance variables are defined as val

  }

  override def toString = f"x :${x}, y:${y} z:${z}"
}

val obj1 = new MyClass(10,20,"A")
obj1

//obj.x = 500 // Cant mutate the object externally

 // the above class can not be mutated as the instance variables
// are not defined as var, the default is the val


class AnotherClass(var x:Int, var y:Int,z:String) {

  def myMethod(x:Int,y:Int) = {

    println("AnotherClass")
    this.x = x
    this.y = y
    //Cant mutate the object because instance variables are defined as var

  }

  override def toString = f"x :${x}, y:${y} z:${z}"
}

val anotherObject = new AnotherClass(10,20,"B")
anotherObject.myMethod(99,99)
anotherObject

//Also we can mutate the object externally
anotherObject.x = 500
anotherObject