val n = 10
var i = 1
var f =1

MyCustomWhile(() => i<n,() => { f *= i;i += 1 })

//MyCode -Wrong, Not even compiling
def MyCustomWhile(condition: () => Boolean , body: () => Unit) {
  //If the condition is true run the body recursively
  //if(condition()) body()
}

MyCustomWhileSolution(() => i<n,() => { f *= i;i += 1 })

//Proper solution
def MyCustomWhileSolution(condition: () => Boolean , body: () => Unit) {
  //If the condition is true run the body recursively
  if(condition()) {
    body()
    MyCustomWhileSolution(condition,body)
  }
}
//Since the value is set to f, need to check the f
f


//Using call by name syntax
MyCustomWhileSolutionNice(i<n,{ f *= i;i += 1 })

def MyCustomWhileSolutionNice(condition: => Boolean , body: => Unit) {
  //If the condition is true run the body recursively
  if(condition) {
    body
    MyCustomWhileSolutionNice(condition,body)
  }
}

//With curring
MyCustomWhileSolutionNiceWithCurring (i<n) { f *= i;i += 1 }

def MyCustomWhileSolutionNiceWithCurring(condition: => Boolean) ( body: => Unit) {
  //If the condition is true run the body recursively
  if(condition) {
    body
    MyCustomWhileSolutionNiceWithCurring(condition)(body)
  }
}