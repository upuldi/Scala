import scala.collection.mutable.ArrayBuffer

//partition receives a predicate
// And it returns a tuple
"New York".partition(_.isUpper)


val arrayBufferOfNegativeNumbers = ArrayBuffer(1,2,3,4,-1,6,7,8,-9,-11,-12,13)
val result = arrayBufferOfNegativeNumbers.partition(_  < 0)
//here the result is a tuple
val (neg,pos) = result
neg
pos

val finalResult = pos
finalResult += neg(0)



//Zip Function
//Creates tuples from two Arrays
val symbols = Array("<","-",">")
val counts = Array(2,10,2)
val pairs = symbols.zip(counts)
pairs(0)
pairs(1)
pairs(2)

for ((a,b) <- pairs) print(a*b)

