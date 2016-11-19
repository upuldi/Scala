import java.net.URL
import java.util.Scanner

//Count the words in the Alice in the Wonderland
def myWayImmutableMap = {
  val in = new Scanner(new URL(
    "http://horstmann.com/presentations/livelessons-scala-2016/alice30.txt").openStream())

  val mutableMapCount = scala.collection.mutable.Map[String,Int]()
  while (in.hasNext) {
    val word = in.next()
    val countIntheMap = mutableMapCount.getOrElse(word,0)
    mutableMapCount.put(word,countIntheMap + 1)
  }
  mutableMapCount
}
val ss = myWayImmutableMap

ss("Alice")
ss("Rabbit")


//Scala Way

def scalaWayImmutableMap = {
  val in = new Scanner(new URL(
    "http://horstmann.com/presentations/livelessons-scala-2016/alice30.txt").openStream())

  val mutableMapCount = scala.collection.mutable.Map[String,Int]()
  while (in.hasNext) {
    val word = in.next()
    mutableMapCount(word) = mutableMapCount.getOrElse(word,0) + 1
  }
  mutableMapCount
}
val kk = myWayImmutableMap

kk("Alice")
kk("Rabbit")



//With an immutable map

def countWithImmutableMap:Map[String,Int] = {

  val in = new Scanner(new URL(
    "http://horstmann.com/presentations/livelessons-scala-2016/alice30.txt").openStream())

  var immutableMap = Map[String,Int]()
  while (in.hasNext) {
    val word = in.next()
    var countIntheMap = immutableMap.getOrElse(word,0)
    countIntheMap = countIntheMap + 1
    immutableMap = immutableMap + ( word -> (countIntheMap + 1))
  }
  immutableMap
}

val response = countWithImmutableMap

response("Alice")
response("Rabbit")