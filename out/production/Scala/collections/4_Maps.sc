//Map definition -- Default is immutable
val immutableMap = Map(1-> "One", 2 -> "Two", 3 -> "Three")

//in order to create a mutable map
val mutableMap = scala.collection.mutable.Map("key1" -> 100,
  "key2" -> 200 )


//Examples

val commonMap = Map("a" -> 10 , "b" -> 20 , "c" -> 30)
val commonMutableMap = scala.collection.mutable.Map("a" -> 10,
  "c" -> 20 , "b" -> 30)

//to access a map (key) is used
val someValue = commonMap("a")
val mutableValue = commonMutableMap("a")


//If you try to access an element which is not in the map
// you get a no such element exception
//val elementWhichIsNotInTheMap = commonMap("x")
//This has been commented out because of the exception

// So the better alternative is to use getOrElse
val elementWhichIsNotInTheMapWithGetOrElse = commonMap.getOrElse("x",999)

//You can assign values to mutable maps

//commonMutableMap("x") = 45

//You can add pairs with +
//Since it s a mutable map we can use +
commonMutableMap += ("k" -> 60,"l" -> 80)
//But if it is a immutable map
val newMap = commonMap + ("SomeNewValue" -> 222)

//In scala use of immutable maps are encouraged
val anotherMap = commonMap + ("d" -> 40 , "e" -> 50)

//You can remove pairs with -
//commonMap - ("a" -> 10)
//
////you can mutate if the map is var
//
//var immutableVarMap = Map("a" -> 10 , "b" -> 20)
//immutableVarMap = immutableVarMap + ("c" -> 30, "d" -> 40)
////immutableVarMap
////immutableVarMap = immutableVarMap - ("c" -> 30)