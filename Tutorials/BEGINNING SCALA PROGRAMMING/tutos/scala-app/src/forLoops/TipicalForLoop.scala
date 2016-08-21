var result = "";

//This is a for loop in scala
for(x <- 1 to 100) {
  result = result + x;
  if(x<100) result = result + ",";
}

println(result);