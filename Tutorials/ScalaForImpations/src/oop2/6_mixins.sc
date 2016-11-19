// Mixings are used to add smaller functionality to classes
// Traits might provide functionality from methods and instance variables
// Different traits provides different type of functionality to the class

// Can also mix into objects

trait Logger {
  //Here You have given an implementation
  def log(message: String) {}
}

trait ConsoleLogger extends Logger {
  override def log(message :String): Unit = {
    println(f"Console logging message [ ${message} ] ")
  }
}

trait FileLogger extends Logger {
  override def log(message: String): Unit = {
    println(f" File logging message < ${message} >")
  }
}

//Here we extends the trait but not the implementation of it
class MyClass extends Logger {
  def doSomething(): Unit = {
    log("message from my class")
  }
}

//Now we can create mixings
val firstInstance = new MyClass with ConsoleLogger
val secondInstance = new MyClass with FileLogger

firstInstance.doSomething
secondInstance.doSomething

// This is similar to late binding in Java


// We can also do this, Which is impossible in Java
val thirdInstance = new MyClass with ConsoleLogger with FileLogger
thirdInstance.doSomething()

