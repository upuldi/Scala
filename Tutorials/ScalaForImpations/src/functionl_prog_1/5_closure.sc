// Function has access to its variables
// Also a function have access to the variables which are available at the
// time when the function is being called.

def mulBy(factor:Double) = (x:Double) => factor * x
val result = mulBy(10)
result(2)

// A function + values for free variables  = closure
