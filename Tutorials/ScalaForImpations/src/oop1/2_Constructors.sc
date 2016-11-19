class MyClassWithAuxiliaryConstruct(x:Int,y:Int) {

  //You can have private variables in Scala
  private val myPrivateVariable = 100;

  //This is a Auxiliary constructor of the MyClass
  def this() { this(0,0)}
}


// In scala primary constructor is already created with the instance variables defined.
//For any other constructors (Auxiliary constructor) you have to define it with this()

//Calling the Auxiliary constructor
val a = new MyClassWithAuxiliaryConstruct()


// In Scala you can avoid the explicit Auxiliary constructors by using default arguments

class MyClassWOExplicitAuxiliaryConstructors(x:Int = 0,y:Int = 0) {}

val b = new MyClassWOExplicitAuxiliaryConstructors()

//In Scala Constructors execute any code in the class body after initializing the instance variables

class MyClassConstructorDemo(a:String="Nothing",b:Double=1.0,c:Int=5) {

  def someMethodWithReturn = a

  //Some Code in the body of the class
  //Here f"expression ${variable}" to format string
  println(f"A is ${a} B is ${b} and c is ${c}")
}

//The code in the class body get executed everytime when an instance is created
val c = new MyClassConstructorDemo()
