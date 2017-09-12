//Printing something
print("Something to be printed")

//You can pass values to the println method to be printed
println("Printing Something ",100,true,4.55232)

//Or else can be concatinated with strngs
println("Printing Something " + 100)

//There are thee types of interpolations in Scala -s,f and raw

//with s interpolation - String style
val someValue = 330
println(s"Printing $someValue")
//can be an expression too
println(s"Printing an expression ${ 5 + 10 / 3 } ")

//f interpolation - format Style
//Used to format values while interpolation
val doubleValue = 5.443344
val stringValue = "SomeStringValue"
println(f"Printing $stringValue%s with $doubleValue%2.2f formatted ")

//Row interpolation just dont skip chractors
println(s"some \n another")
println(raw"some \n another") //No new line in here


