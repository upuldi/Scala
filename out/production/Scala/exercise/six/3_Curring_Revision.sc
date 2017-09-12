import com.sun.xml.internal.ws.client.sei.ResponseBuilder.Body

//Wtf is curring ??
def someFunctionWithTwoParameters(x:Int,y:Int) = x*y
def someFunctionWithCurring(x:Int) = (y:Int) => x*y
someFunctionWithCurring(10)(20)

def someStupidFunction(value:Int,str: String) = f"Stupid function returns a String with value ${value} and String ${str}"
someStupidFunction(100,"money")

//How to curry this function
def curriedStupidFunction(value: Int) = (str:String) => f"some curried function with value ${value} and string ${str}"
curriedStupidFunction(100)("money")


//Control abstraction
val x = 10
val y = 5
val z = "****"

DoSomethingForMeIFTrue(x>y){println(f" ${z} ${x} ${z} ${y} ${z}" )}

def DoSomethingForMeIFTrue(condition: => Boolean) = {
  (body: => Unit) => {
    if (condition) {
      body
    }
  }
}

//With Scala synthetic sugar for curring

DoSomethingForMeIFTrueNice(x>y) {println(f" ${z} ${x} ${z} ${y} ${z}" )}
def DoSomethingForMeIFTrueNice(condition: => Boolean) (body: => Unit) = {
    if (condition) {
      body
    }
}
