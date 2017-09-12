// Function has access to its variables
// Also a function have access to the variables which are available at the
// time when the function is being called.
//Also considered as a function that can be stored as a variable

def mulBy(factor:Double) = (x:Double) => factor * x
val result = mulBy(10)
result(2)

// A function + values for free variables  = closure


//Another example
val rangeMultiply = (start:Int) => (end:Int) => for( x <- start to end by 5) yield x*x
rangeMultiply(0)(10)
