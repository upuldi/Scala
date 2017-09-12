//Extractors can be used to extract values

//This is a tuple
val pair = ("x",0)

val result = pair match {
  case ("0",_) => "Zero first and anything next"
    //Here we are doing a match and extract that value at the same time...
  case (y,_) => f"Matching and extract y value out : ${y}"
  case _ => "Default case no matching found....."
}

result
