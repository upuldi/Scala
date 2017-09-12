//Can model a sequence of statements as a function with no parameters
//Then provides a control abstractions that manipulate that function

//pass some kind of behaviour that can be executed later

//How to run a code block in a different thread
def runInThread(functionBlock: () => Unit ): Unit = {
  new Thread {
    override def run() = {
      //Here the passed function block get executed
      functionBlock()
    }
  }.start()
}

//Ugly call
runInThread(() => { println("Hi"); Thread.sleep(10000) ; println("Bye...") })



//Scala provides some synthetic sugar.
//Call by name notation
//See the difference between : () => Unit and
// block :=> Unit
def niceRunInThread(block: => Unit): Unit = {
  new Thread {
    override def run(): Unit = {
      block
    }
  }.start()
}
//Now the call looks prettier
niceRunInThread { println("Hi...."); Thread.sleep(10000) ; println("Bye...") }
//This can be used to introduce new syntaxes to the language

//Some Test
def decorateMeWithStarts(text: => Unit) = {
  println(f"\n************")
  text
  println(f"************\n")
}

decorateMeWithStarts{ println("Hello");println("How are you");println("I am fine");println("Thank you") }


//Here is the better example

//Here is a consumer which consumes a function
val codeExecutor = (f: () => Unit) => {
  println("I am executing code ......")
  f()
}
//In order to invoke this consumer, I am passing a function
codeExecutor(() => {println("Passing code block....")})


//With syntatic sugar you can define the same more nicely, and call them
//Here the only syntatic sugar is the this
// function is defined as it has an input of type Unit instead of a function
val niceCodeExecutor = (f: Unit) => {
  println("I am nicely executing the code...")
  f //no pranthisis here
}

//Nice way of executing code is
niceCodeExecutor{ println("With Nice code executor....") }








