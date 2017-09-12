abstract class DoubleOption
case class SomeDouble(value:Double) extends DoubleOption
case object NoDouble  extends DoubleOption // Since there is only one is required

def inverse(value:Double):DoubleOption = {
  if(value == 0) NoDouble else SomeDouble(1/value)
}

inverse(10)
inverse(0)
inverse(.5)



//composition
import scala.math._

//This is a some function
def other(x:Double) = if (x <=1) SomeDouble(sqrt(1-x)) else NoDouble

def composeBoth(secondFuncion: Double => DoubleOption,
                inverseFun: Double => DoubleOption) = (x:Double) => inverseFun(x) match {
  case SomeDouble(result) => secondFuncion(result)
  case NoDouble => NoDouble
}

val composeRes = composeBoth(other,inverse)
composeRes(0)
composeRes(12)