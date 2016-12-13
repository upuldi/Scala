//You can define variables just like in case clause
//val (upperCase,lowerCase) = "Hello, World".partition(Character.isUpperCase(_))
val (upperCase,lowerCase) = "Hello, World".partition( c => Character.isUpperCase(c))
upperCase
lowerCase

//Define Two variables by extraction
//Here we are creating two variables from the array by extracting the first and second elements
val Array(firstElement,secondElement,_*) = Array("A","B","C")
firstElement
secondElement

//Also you can extract the rest of the array to a variable with special <variable name> @_* syntax
val Array(first,second, rest @ _*) = Array("A","B","C","D","E")
first
second
rest

//The same extraction technique can be used to maps
val map = Map("A" -> 1, "B" -> 2 , "C" -> 3)
for( (key,value) <- map) println(f" Key is ${key} value is ${value}")
