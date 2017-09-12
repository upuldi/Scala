//Safe alternative to provides a value of T or null
//Case class has two alternatives
// Case class Some[T] -> Wraps a value
// Case object None -> Indicates there is no value


//For eg: Map get() returns an option, either value wraped in Some or None
val map = Map("KeyOne" -> 1, "KeyTwo" ->2)
map.get("KeyOne") match {
  case Some(value) => println(s" Value found was : ${value}")
  case None => println("Nothing found.....")
}
