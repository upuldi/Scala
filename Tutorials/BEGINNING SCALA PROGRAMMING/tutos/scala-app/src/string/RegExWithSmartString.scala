val meessage = "This is a string message with time at the end 12:30pm";
//We are using a smart string to keep the pure form of regex (without escape chars)
//Dont forget the r, r will convert the string into a regex.
val regExForExtractingTime = """(\s|[0-9)?[0-9]:[0-5][0-9]\s*(AM|PM)""".r;
//now to get the matching strings
println(regExForExtractingTime.findAllIn(meessage).toList);