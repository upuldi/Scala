val originalList = List(0,1,2,3,4);
var newList = List[Int]();
for(a <- originalList) {
  newList = newList :+ (a+1);
}
println("New : " + newList);
println("Original : " + originalList);