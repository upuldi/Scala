var value = 100;
var result = "";
while(value>0) {

  result = result + value;
  if(value>1) result = result + ",";
  value =value - 1;
}
println(result);

println("RESULT WITH FUNCTIONL LOOPS....")

//With Functional Loops
val resultWithFunctionalLoops = (1 to 100).reverse.mkString(",");
println(resultWithFunctionalLoops);

println("Another Example....")
val anotherResultWithFunctionalLoops = (100 to 1 by -1).mkString(",");
println(anotherResultWithFunctionalLoops);
