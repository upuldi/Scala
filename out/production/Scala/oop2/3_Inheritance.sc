import scala.collection.mutable.ArrayBuffer

//Works same as Java, use extends keyword
class SomeClass extends ArrayBuffer{}

//Instance checking can be done via instanceOf Operator
val a = new SomeClass
a.isInstanceOf[SomeClass]

//This is similar to casting in java
// val someClassInstance = (SomeClass) a
val someClassInstance = a.asInstanceOf[SomeClass]

// To get the class object
// This is similar to SomeClass.class in java
val classObjectOfTheInstance = classOf[SomeClass]

