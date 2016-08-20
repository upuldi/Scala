var x = 100;
var result = "";

do {
  result = result + x;
  if(x>1) result = result + ",";
  x = x -1;
} while(x>0)

println(result);