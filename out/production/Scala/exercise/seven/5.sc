abstract class DoubleOption
case class SomeDouble(value:Double) extends DoubleOption
case class NoDouble(message:String) extends DoubleOption

def inverseMaker(value:Double):DoubleOption = {

  val x = 1/value
  x match {

    case _ if(value==0) => NoDouble("zero")
    case _ if(x > 0) => SomeDouble(x)
  }
}


inverseMaker(.5)
inverseMaker(.25)
inverseMaker(0)

//Proper solution can be seen in the next sheet


