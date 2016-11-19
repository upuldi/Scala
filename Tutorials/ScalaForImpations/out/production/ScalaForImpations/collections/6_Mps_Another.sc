val immutableMap = Map[String,Int]("A" -> 1, "B" -> 2, "C" ->3)
val mutableMap = scala.collection.mutable.Map[String,Int]("A" -> 1, "B" -> 2 , "C" -> 3)

//Different to jave it is very easy to set and get values from Maps in Scala
immutableMap("A")
mutableMap("B")


var someOther = mutableMap + ("D" -> 30)
