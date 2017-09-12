//To define functions
// def <function_name>(parameters:type) = body
// Return type is inferred unless its a recursive funtion

def sampleFunction(a:Int) = println("Function call " + a)
sampleFunction(10)
//For recursive functions, return type is required

def factorial(n:Int):Int = if (n==0) 1 else n * factorial(n-1)
print(factorial(5));
//In functions = denotes that the funtion does return some value.
// for void functions return type isnt required

def someFunctionWithNoReturnValue(a : Int){
  println(a);
}

someFunctionWithNoReturnValue(100)
//The same function can be declared with following syntax
// Here we are explicitly defining the return type of the function as void (unit)
def someFunctionWithNoReturnValueAnotherWay(a : Int): Unit = {
  println(a);
}


//Defining calling functions without return types


def someFunctionWoRTFirstWay = {
  println("Some Function Wo Return Type First Way...")
}

def someFunctionWoRTSecondWay :Unit = {
  println("Some Function Wo Return Type Second Way...")
}

def someFunctionWoRTThirdWay {
  println("Some Function Wo Return Type Third Way...")
}

someFunctionWoRTFirstWay
someFunctionWoRTSecondWay
someFunctionWoRTThirdWay
//if a method returns a value there is no need to define it with a return keyword
//return keword is not mandatory in Scala.
def vovlesChecker(in:String) = {
  var rtString= ""
  for (x <- in;if("aeiou".contains(x))) rtString += x
  //Here putting this without the return keyword means you are returning that value
  rtString
}

vovlesChecker("abcdefghijklmno")
