//ArrayBuffer is the analog for java ArrayList
//To use an array buffer you have to import scala mutable array buffer

import scala.collection.mutable.ArrayBuffer;

var arrayBuffer = ArrayBuffer("string one","string two", "string three")

arrayBuffer(0)

arrayBuffer.reverse

//you can add elements to the array buffer by using =+

arrayBuffer += "new element one"
arrayBuffer += ("another","some","other")

arrayBuffer ++= Array("another element","some element")

//To Remove elements
//You have to pass the index of the element you want to remove from the array
//Removed element is presented back
arrayBuffer.remove(1)

//To insert a value also you can use an index.

arrayBuffer.insert(2,"inserted string")


//To convert between buffers and arrays
val arrray = arrayBuffer.toArray
val arrayBufferFromArray = arrray.toBuffer