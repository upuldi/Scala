//Tuples holds values of different types
//Tuple contains array of different types where as arrays contains same types
//collection
val aTuple = (1,1.32223,"StingValue")

//You can access an individual component in tuple with ._ operator
//Those are one indexed, not zero baed
val secondPositionInTuple = aTuple._2

//pattern matching
//To create values based on the tuples\
//here the first value will not be created as a variable
val ( _, aa , bb) = aTuple
aa
bb

//Tuples are good to pass values from function when more than one value is passed from the function.
