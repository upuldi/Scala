
//My Solution
def swap(a: Array[Int]):Array[Int] = {
  var finalArray = new Array[Int](2)
  val Array(first,second, rest @_*) = a

  println(f" first : ${first}")
  println(f" second : ${second}")
  for (x <- rest) println(f"rest ${x}")


  finalArray(0) = second
  finalArray(1) = first
  finalArray = finalArray ++ rest
  return finalArray

}

val finalRes = swap(Array(1,2,3,4,5))
for(x <- finalRes) println(f"result ${x}")



//Proper Solution

def swapArray(a:Array[Int]) = {
  a match {
    case Array(x,y, rest @ _*) => Array(y,x) ++ rest
    case _ =>  {println("Error return original"); a}
  }
}
val finalResCorrect = swapArray(Array(1,2,3,4,5))
for(x <- finalResCorrect) println(x)

swapArray(Array(1))