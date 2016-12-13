//Use can use match to catch exceptions
try {

  val x = Array("A","B")
//  x(3)

  1/0

} catch {
  case e: IndexOutOfBoundsException => println("IndexOutOfBoundsException occurred ... ")
  case e: NullPointerException => println("NullPointerException occurred ... ")
  case e: NullPointerException => println("NullPointerException occurred ... ")
  case _ => println("Some other exception occurred ......." )
}


//Catching and throwing exceptions in Scala
try {

  val x = Array("A","B")
  //  x(3)
  1/0
} catch {
  case _:Throwable => println("Exception occurred ......." )
}