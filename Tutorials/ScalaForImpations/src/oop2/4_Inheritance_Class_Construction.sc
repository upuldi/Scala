// Super Class Construction

class MySuperClass(name:String,Age:Int) {}

//Here you have to define the specific constructor that you are invoking
class MySubClass(name:String,Age:Int,SomeThingElse:Double)
  extends MySuperClass(name,Age)


//For ex, If the parent has a default constructor
class Parent(name:String,Age:Int) { def this() { this("",0)} }

class Child(name:String,Age:Int,SomeThingElse:Double)
  extends Parent
