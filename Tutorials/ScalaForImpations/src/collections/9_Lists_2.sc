//Filtering
val list = List.tabulate(10)(_+1)
//Takes a function as a input
val filteredList = list.filter(_ % 2 == 0)

//Takewhile
val takeWhileList = List.tabulate(10)(x=> x+1)
val takeWhileDemo = takeWhileList.takeWhile(_ < 6)

///Taking a list into variables
val someList = List.fill(5)("AA")
val a::b::c::d = someList
a
b
c
d


