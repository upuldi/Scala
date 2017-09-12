1.to(10)
(1 to 10).reduceLeft(_ * _)
( 1 to 5).reduceLeft(_ + _)

//Function that computes !n

def factorialCalculator(n:Int) = ( 1 to n).reduceLeft(_ * _)

factorialCalculator(5)
factorialCalculator(13)

def factorialWithRecursion(x:Int):Int = {

  if (x==1) return 1
  else {
    return x * factorialWithRecursion(x-1)
  }
}

factorialWithRecursion(13)


//My Solution
def powerOfTwo(n:Int) = (1 to n).map(x => 2).reduceLeft(_ * _ )
powerOfTwo(3)
powerOfTwo(10)

def twoPower(n:Int):Int = {
  var res = 1
  for (x <- 1 to n) res = res*2
  return res
}

twoPower(3)
twoPower(10)



def stringConcatinator(strings: Seq[String], separator: String) = {
//  strings.reduceLeft(_ + separator + _)
  //strings.reduceLeft( (x:String,y:String) => x.concat(separator).concat(y))
  strings.reduceLeft( (x,y) => x.concat(separator).concat(y))
}

stringConcatinator(Array("Marry","had","a","little","lamb")," ")
stringConcatinator(Array("Marry","had","a","little","lamb"),"-")
stringConcatinator(Array("Marry","had","a","little","lamb"),"***")