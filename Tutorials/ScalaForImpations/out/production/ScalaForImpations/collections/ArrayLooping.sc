//In order to loop through an array by its index you can use until method
val array = new Array[Int](10)

//now i am looping through it by index
for (i <- 0 until  array.length) array(i) = i*i

//Also the same thing can be done as this
for (x<- 0 until array.length) yield x*x

//to view array elements
for(e <- array) println(e)

//mutating arrays
//Scala we don't mutate arrays

val anIntArray = Array(1,2,3,4,5);
val mutatedIntArray = for (x<- anIntArray) yield x*x

//With a guard condition
val results = for (x<- anIntArray if x%2 == 0) yield x*x

//Reversing and sorting arrays
//The original array does not get mutated.

val unsortedArray = Array(3,4,1,2,5)
val sortedArray = unsortedArray.sorted
//but still the original unsorted array is not sorted
unsortedArray

//An array can be reversed by reverse method
val reveredArray = sortedArray.reverse

//toString() will work like java
reveredArray.toString

//But mkString will work, You have to provides a separator for that
reveredArray.mkString(" | ")
