//scala array
val someArray = new Array[String] (3)
val anotherArray = new Array[String](2);
val arrayWithValues = Array("Something","anotherThing");

//looping

for(x <- someArray;y <- 1 to 3) yield y*2
someArray

for (x<- 0 until someArray.length) yield x*x

val intArray = new Array[Int](5);

for (x<- 0 until intArray.length) intArray(x) = x * 5

intArray

//array buffer


