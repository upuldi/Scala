//In Scala higher order functions are encouraged instead of using loops

//For loops demo
//In scala for loops you dont have to define the looping variable
val n = 10
for (i <- 1 to n) println(i)

//Another example
for (n <- 1 to 5) println("Something..")

//with more statements inside the loop
for (i <- 1.to(10)) {
  print("Something ")
  print("and something else \n")
}

//Can assign it to a variable
val result = for(k <- 1 to 10) yield k*k
println(result)

//Looping reversed
for (i <- n to 1 by -1) println(i)
//Looping forward
for (i <- 10 to 25 by 5) println(i)

//Also it can be used to any collection
for (i <- "hello") println(i)

//until
val s = "ABCDEF"
for(x <- 0 until s.size) println(s.charAt(x))

//Looping returns the type similar to the origin size
val someString = "ABCDEFGH"
val response = for(x <- someString.length-1 to 0 by -1) yield someString.charAt(x)
response.mkString



//Arrow in the for loop is called generators,
// You can have more than one generators in an single loop
//For every i j will be looped, this is similar to loop inside loop
for (i <- "hello"; j <- "world") println(" " + i + "  " + j)

val res = for (x <- 1 to 5; j <- 1 to 5 ) yield x + j
println("result ", res)

//Guards are conditions where we can used with if statements.
//In order to be considered the every value should fullfill the guard condition
for (i <- 1 to 3; j <- 1 to 3; if (i != j)) println(i + "" + j)


//yield and collecting the results
for (i <- 1 to 10) yield i * 10
//here instead of looping sequentially you can apply a function to it at once.
//Yield is used to collect values
def vovelsWithYeild(in: String) = {
  //Here this yield is used to collect the values passing from the
  // guard condition
  for (x <- in; if ("aeiou".contains(x))) yield x
}
vovelsWithYeild("abcdefg")

//while loops
def someWhileLoopMethod(n:Int) = {
  var x = 0;
  while (x<n) {
    println(x)
    x += 1
  }
}
someWhileLoopMethod(10)

//Another While loop
var k = 50
while (k < 10) {
  println(k)
  k = k - 10
}

//Loop conditions
//You can put a if in the place where the collection is there
def myLoopCondition(n:Int) = {
  for (x <- if (n > 5) 1 to 5 else 1 to n ) println(x)
}
myLoopCondition(10)
myLoopCondition(3)


