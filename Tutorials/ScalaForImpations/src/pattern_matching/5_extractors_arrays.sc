//used to extract values from arrays
//Same as with tuples
//Case statement constructs a matching array

val array = Array("A","B","C")

val result = array match {
  //Here we are matching an exact array ...
  case Array("x") => "One item array"
    //Here we are matching an array containing exactly two elements and extract them
  case Array(x,y) => f"Two Item array ${x} , ${y}"
    //Here we are matching an array start with specific value and followed by any number of elements
  case Array("A",_*) => f"Start with a known element and I dont care whats the rest of the array is ...."
  case _ => "Default Case"
}

//Another example
// You can extract values from the structure you are matching for pattterns
val arrayTwo = Array("A","B","C")
val resultTwo = arrayTwo match {
  //Here we are extracting while doing the pattern
  case Array(p,_*) => f"Start with a known element of ${p} ...."
  case _ => "Default Case"
}