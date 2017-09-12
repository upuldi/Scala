//ArrayBuffer is the analog for java ArrayList
//To use an array buffer you have to import scala mutable array buffer

/**
  * Both arrays and array buffers are mutable
  * ArrayBuffers are resizable whereas arrays are not
  *
  * So the biggest difference is that in order to work with
  * Arrays you have to know the size beforehand whereas with
  * array buffers you don't need to know a size
  *
  * Arrays are at JVM level so it is more efficient
  * ArrayBuffers uses an array internally
  *
  */


import scala.collection.mutable.ArrayBuffer;

//Can define type as Arrays
val basicAB = ArrayBuffer[Int](3)
basicAB += 100
basicAB += 200
basicAB += 300
basicAB

var arrayBuffer = ArrayBuffer("one","two", "three")
arrayBuffer(0)
arrayBuffer(1)
arrayBuffer(2)

//you can add elements to the array buffer by using =+
arrayBuffer += "four"
arrayBuffer += ("five","six","seven")

//Can Add another collection with ++=
arrayBuffer ++= Array("eight","nine","ten")

//To Remove elements
//You have to pass the index of the element you want to remove from the array
//Removed element is presented back
arrayBuffer.remove(1)
arrayBuffer

//remove more than one elements
//remove(stratIndex,noOfelements)
arrayBuffer.remove(2,3)
arrayBuffer


//To insert a value - insert(index,value)
arrayBuffer.insert(2,"inserted string")
arrayBuffer

//Supports insert(index,val1,val2...)
arrayBuffer.insert(3,"1","2","3")
arrayBuffer

//To convert between buffers and arrays
val toArray = arrayBuffer.toArray
val toBuffer = toArray.toBuffer

//API
//Reverse - returns the reversed array
val reversedArrayBuff = arrayBuffer.reverse
reversedArrayBuff
arrayBuffer

//trim end removed from end
arrayBuffer.trimEnd(3)
arrayBuffer
