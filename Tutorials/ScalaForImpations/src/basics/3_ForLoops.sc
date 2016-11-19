//For loops demo
//Here you don't have to define i
val n = 10
for (i <- 1 to n) println(i)
//This is equalent to java for loop
// for(i <- 1 to n ) == for (i=1;i<=n;i++)
//Looping backwards
for (i <- n to 1 by -1) println(i)
//Also it can be used to any collection
for (i <- "hello") println(i)
//Arrow in the for loop is called generators, You can have more than one
//generators in an single loop
//For every i j will be looped
for (i <- "hello"; j <- "world") println(" " + i + "  " + j)

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


//Loop conditions
//You can put a if in the place where the collection is there
def myLoopCondition(n:Int) = {
  for (x <- if (n > 5) 1 to 5 else 1 to n ) println(x)
}
myLoopCondition(10)
myLoopCondition(3)


