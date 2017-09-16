//Lisp style
val list = 1 :: 2 :: 3 :: Nil
println(list)

//List companion
val anotherList = List(1,2,3,4)
print(anotherList)

//full definition
val fullDefinition = List[Int](1,2,3)
println(fullDefinition)

//List range
val intListWithRange = List.range(1,10)
println(intListWithRange)

//List fill - apply it to all the elements
val listFill = List.fill(3)("Something to fill as element")
println(listFill)

//List tabiulate -- fill the list based on the function
val listTabulate = List.tabulate(5)(n => n * n)
println(listTabulate)

//Prepending using :: operator
val prependingTest = List("AA","BB","CC")
val prependedList = "PP" :: prependingTest
println(" Prepended List : " +  prependedList)


//Merging a list with another using ::: operator
val mergingTest1 = List("A","B","C")
val mergingTest2 = List("P","Q","R")
val mergedListsTest = mergingTest1 ::: mergingTest2
println(" Merged List" + mergedListsTest)


//A list can be iterated with foreach and for
//foreach
val foreachDemo = List.fill(3)("A")
foreachDemo.foreach(s => println(s"Element : ${s}"))

//for is an expression
val forDemo = List.tabulate(5)(x=>x+1)
for (x <- forDemo) println(s"forDemo ${x}")