val originalList = List(0,1,2,3,4);
//yeild will create a new loop
val newList = for (x<-originalList) yield (x+1);
println("new : " + newList)
println("original : " + originalList)