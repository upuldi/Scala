//Simple definition
val immutableMap = Map(1-> "Value of one", 2 -> "Value of two", 3 -> "Value of three")

//By default maps are immutable in scala
//in order to create a mutable map

val mutableMap = scala.collection.mutable.Map("key1" -> 100, "key2" -> 200 )

val commonMap = Map("a" -> 10 , "b" -> 20 , "c" -> 30)
val commonMutableMap = scala.collection.mutable.Map("x" -> 10, "y" -> 20 , "z" -> 30)

//to access a map ( ) is used
val someValue = commonMap("a")

//If you try to access an element which is not in the map
// you get a no such element exception
//val elementWhichIsNotInTheMap = commonMap("x")
//This has been commented out because of the exception


// So the better alternative is to use getOrElse
val elementWhichIsNotInTheMapWithGetOrElse = commonMap.getOrElse("x",999)


//You can assign values to mytable maps
commonMutableMap("x") = 999
commonMutableMap

//You can add pairs with +

commonMutableMap + ("k" -> 60,"l" -> 80)

commonMutableMap

//In scala use of immutable maps are encouraged

val anotherMap = commonMap + ("d" -> 40 , "e" -> 50)

//You can remove pairs with -
//commonMap - ("a" -> 10)

//you can mutate if the map is var

var immutableVarMap = Map("a" -> 10 , "b" -> 20)
immutableVarMap = immutableVarMap + ("c" -> 30, "d" -> 40)
immutableVarMap
//immutableVarMap = immutableVarMap - ("c" -> 30)
