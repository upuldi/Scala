val x = 10
val ifx = if (x>5) 10 else 20;

val codeBlock = {
  val x =100;
  val y = 200;
  x > y
}

val forx = 10;
for (i <- 1 to forx) {
  println(i)
}
for (i<- forx to 1 by -1) {
  println(i)
}
//with more than one generator
for(a <- 1 to 6; b <- 1 to 5 ) {
  println( a +  " " + b )
}
//with guard conditions
for(a <- "hello" ; b <- "world"; if (a.equals(b))) {
  println(a+""+b)
}
"ABCD".permutations.toStream