//Interpolation means replacing a world within a context
val someVal = "SomeStrngVal";
//Note the beginning S, This is the S interpolation - String
println(s"Some string interpolation example.... ${someVal}")
//Parenthesis are not mandatory for single value
println(s"Some string interpolation example - wp parenthesis.... $someVal")

//Some example with f interpolation
val itemPrice = 1345;
val brandName = "Apple";
println(f"The ${brandName} mobile phones are priced at $$${itemPrice}%1.2f");