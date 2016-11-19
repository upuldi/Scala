//Trait methods can invoke others in prior layers
trait Logger {
  def log(message: String) {"Logger class default logger " + message}
}

trait ConsoleLogger extends Logger {
  override def log(message :String) {
    println(f"Console logging message [ ${message} ] ")
  }
}

trait FileLogger extends Logger {
  override def log(message: String) {
    println(f" File logging message < ${message} >")
  }
}

trait TimeStampLogger extends Logger {

  import java.util.Date

  override def log(message:String) {
    //Invoke the superclass method
    //However invoked method wil be depend on the order of the trait at the runtime
    super.log(new Date() + " " + message)
  }
}

trait FancyLogger extends Logger {
  override def log(message:String) {
    //Invoke the superclass method
    //However invoked method wil be depend on the order of the trait at the runtime
    super.log(f" Fancy Logger ***** ${message} ***** ")
  }
}


//Here we extends the trait but not the implementation of it
class MyClass extends Logger {
  def doSomething(): Unit = {
    log("message from my class")
  }
}


//Execution order it from end to beginning
// So TimeStampLogger > Console Logger
val instanceOne = new MyClass with ConsoleLogger with TimeStampLogger
instanceOne.doSomething

//TimeStampLogger > ConsoleLogger > FancyLogger
val instanceTwo = new MyClass with FancyLogger with ConsoleLogger with TimeStampLogger
instanceTwo.doSomething

val instanceTree = new MyClass with ConsoleLogger  with FileLogger with FancyLogger with TimeStampLogger
instanceTree.doSomething