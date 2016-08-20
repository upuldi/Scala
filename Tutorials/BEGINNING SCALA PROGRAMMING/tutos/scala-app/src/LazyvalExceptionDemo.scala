//Lazy vals are forgiving for exceptions at first time
var deviser = 0;
lazy val result = 100/deviser;
println(result);
//first time it should be an arithmatic exception

deviser = 10;
println(result);
