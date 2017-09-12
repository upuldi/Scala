//Producer is a function which produces another function
//Producers are also higher order functions
def producer(x:Int) = (y:Int) => x* y
val result = producer(10)
result(2)

val annonymousFunction = (x:Int) => x*x
val consumerAnnonymous = (f: (Int) => Int) => f(10)
def consumberNamed(f: (Int) => Int) = f(10)
val producerAnnonymous = (x:Int) => (y:Int) => x*y
def producerNamed(x:Int) = (y:Int) => x*y



// Scala can deduce types, if the type is obvious
val someConsumer = (f: (Int) => Int) => f(10)
someConsumer((x:Int) => x*x)
//You can omit the type definition here
someConsumer((x) => x*x)
//Also you can omit the parenthesis
someConsumer(x => x*x)

//If the parameter only occurs once you can omit the parameter as well
someConsumer(5 * _)


//Another Example
val annonymous = (fun : (Int) => String) => fun(10)
annonymous( (x:Int) => f"Some consumer says ${x}"    )
annonymous(x => f"Some Consumer nicely says ... its easy ${x}")
annonymous(f"Some consumer says... Its the easiest " + _)

//Here we are passing an annonymous function defined in various ways


//Another Example
val firstWay = (f : (Int) => Int) => f(_:Int) * 2
println(s"first method response ${ firstWay( (x:Int) => x*x  )(10)   }")

val secondMethod = (x:Int) => (y:Int) => x*x*y
println(s"Second method : ${ secondMethod(10)(2)  }")
