//In Scala Object is used to represent memeber/class variables or methods in java
//In Other words static methods and variables are kept in Objects
//Object is a singleton and has one instance

object MyObject {

  private var somePrivateField= 10.5

  def someStaticMethod = f"Some Static Method ${somePrivateField}"

  def someMethodChangeTheState = somePrivateField += 1


}

// Invoking the class member
MyObject.someStaticMethod

//Calling the method to change the state
MyObject.someMethodChangeTheState
MyObject.someMethodChangeTheState
MyObject.someStaticMethod


//In order to run code like in main method of Java you have to define
// and extend the App object in Scala

