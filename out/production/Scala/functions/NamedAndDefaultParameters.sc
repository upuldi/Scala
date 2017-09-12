//Scala supports names and Default Parameters


def decorateString(string: String, left: String = "(", right: String = ")") = {
  left + string + right
}

//Normal method call
println(decorateString("Hello", "[", "]"))
//Wit default values
println(decorateString("Hello"))
println(decorateString(left = "<", string = "Hello"))
println(decorateString(right = ">", string = "Hello"))
//Var arguments are also supported,
// Those arguments will be coming to the method as a sequence

def varArgsDemoWithSeq(x:Int*) = {
  //The sequence can be treated as a collection
  for(i <- x) yield i * 10
}
varArgsDemoWithSeq(1,2,3,4,5)


//Good Example

def functionWithDefaultParams(x:Int = 10,y:String = "Hello", z:Double = 5.3): Unit = {
  println(s"Received values are X: ${x} Y ${y} and Z ${z} ")
}

functionWithDefaultParams(1,"Hi",2.1)
functionWithDefaultParams() //Not passing anything
functionWithDefaultParams(z=8.8,y="Special case")
