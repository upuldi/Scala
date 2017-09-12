import scala.collection.mutable.ArrayBuffer

var arrayBufferWithNegativeNumbers = ArrayBuffer(1,8,3,4,2,-1,5,-6,55,-14,80,-124,344)

//Get the first negative number of the ArrayBuffer

arrayBufferWithNegativeNumbers

//This logic is not so good
var negativeOnlyArray =   for (x <- arrayBufferWithNegativeNumbers; if x < 0) yield(x)
negativeOnlyArray(0)

//Remove the first negative number of an array buffer

var anotherAttempt = arrayBufferWithNegativeNumbers
var kk = for (x <- 0 until anotherAttempt.length ; if anotherAttempt(x) < 0) yield(x)
anotherAttempt.remove(kk(0))
anotherAttempt

//Keep the first negative number and remove the rest
var keepFirstAndRemoveRest = ArrayBuffer(4,5,-2,44,-23,12,-54,50)
var indexesOfNegativeValues = for (x <- 0 until keepFirstAndRemoveRest.length if keepFirstAndRemoveRest(x) < 0) yield (x)
var indexesNeedTORemove = indexesOfNegativeValues.drop(1)
indexesNeedTORemove
//Since removing item will change the index
for (x <- indexesNeedTORemove.reverse) keepFirstAndRemoveRest.remove(x)
keepFirstAndRemoveRest


//Create a function which removes all the negative values except the first one

def removeNegativesExceptFirst(a:ArrayBuffer[Int]) = {

  var negativeIndexs = for (x <- 0 until a.length if a(x) < 0  ) yield(x)
  var removingIndexes = negativeIndexs.drop(1)
  for (x <- removingIndexes.reverse) a.remove(x)
  a
}

removeNegativesExceptFirst(ArrayBuffer(1,2,3,-4,5,-6,-7,8,-9))


//Second Approach - Return the positive values including the first negative number

var secondAppBuffer = ArrayBuffer(1,2,-3,4,-5,-6,-7,8,9)
var indexesToRemove = (for(x <- 0 until secondAppBuffer.length if secondAppBuffer(x) < 0 ) yield x).drop(1)
for(x <- 0 until secondAppBuffer.length if !indexesToRemove.contains(x)) yield secondAppBuffer(x)

//Here the original buffer does not get mutated, So this is the preferred approach in Scala
def removeAllButFirstSecondApproach(b:ArrayBuffer[Int]) = {
  var indexesToRemove = (for(x <- 0 until b.length if b(x) < 0 ) yield(x)).drop(1)
  for (x <- 0 until b.length if !indexesToRemove.contains(x)) yield b(x)
}

removeAllButFirstSecondApproach(ArrayBuffer(1,2,-3,4,-5,-6,7))
