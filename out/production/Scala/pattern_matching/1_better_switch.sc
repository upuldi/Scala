//match is similar to java Switch statement.
//There is no break
// It is like if statement you can assign the value

val ch = "-"
val sign = ch match {
  case "-" => 1
  case "+" => 2
  case "%" => 3
  //You can also put guard statements
  case _ if ("%%".equals(ch)) => "Something else"
    //You can also put a variable in the statemnt as bellows
  case  anotherCase if ("%%".equals(anotherCase)) => "Variable Value"
  //if you want to have a default case it is being represented by the _
  case _ => 100
}
sign


//case variable assign the mathing expression to the variable
val checkingValue = "ABCDEF"
val result = checkingValue match  {

  case "A" => "AAAA"
  case "B" => "BBBB"
  case another if(checkingValue.length > 2) => "sssss"
}
result

//Since you can defined variables in the pattern match as above it is a standard to define variables as the lower case values
// So you can distinguish between variables and constants in patterns