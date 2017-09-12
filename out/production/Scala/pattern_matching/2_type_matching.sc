//This is similar to value matching but you have to include a :

val beingMatched = 100
val result = beingMatched match {
  case z:Int => z.toString + " int type"
  case _ => "Something else"
}



//This is the preferred way over var.isInstanceOf[Type]