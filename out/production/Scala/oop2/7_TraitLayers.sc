//Trait methods can invoke others in prior layers
trait Logger {
  def log(message: String) {"Default Logger" + message}
}

trait ConsoleLogger extends Logger {
  override def log(message :String) {
    println(f"Console Logger [ ${message} ] ")
  }
}

trait FileLogger extends Logger {
  override def log(message: String) {
    println(f"File Logger < ${message} >")
  }
}

trait TimeStampLogger extends Logger {

  import java.util.Date

  override def log(message:String) {
    println("TimeStamp Logger")
    //Invoke the superclass method
    //However invoked method wil be depend on the order of the trait at the runtime
    super.log(new Date() + " " + message)
  }
}

trait FancyLogger extends Logger {
  override def log(message:String) {
    println("FancyLogger")
    //Invoke the superclass method
    //However invoked method wil be depend on the order of the trait at the runtime
    super.log(f"${message}")
  }
}


//Here we extends the trait but not the implementation of it
class MyClass extends Logger {
  def doSomething(): Unit = {
    println("MyClass Do Something method")
    log("Message")
  }
}


//Execution order it from end to beginning
// So TimeStampLogger > Console Logger
val instanceOne = new MyClass with ConsoleLogger with TimeStampLogger
instanceOne.doSomething

//TimeStampLogger > ConsoleLogger > FancyLogger
val instanceTwo = new MyClass with FancyLogger with ConsoleLogger with TimeStampLogger
instanceTwo.doSomething


//TimeStamp > Fancy > File > Console
val instanceTree = new MyClass with ConsoleLogger  with FileLogger with FancyLogger with TimeStampLogger
instanceTree.doSomething