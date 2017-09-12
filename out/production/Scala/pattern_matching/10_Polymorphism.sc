//Case classes are useful to mimic Polymorphic behaviour
//If the data set is limited it is useful to use case classes
//However if the data set is unlimited it is best use polymorphism

//Same example in Polymorphism

abstract class Expression {
  def evaluate: Int
}

class Number(val value:Int) extends Expression {
  override def evaluate: Int = value
}

class Sum(val left:Expression, val right: Expression) extends Expression {
  override def evaluate: Int = left.evaluate + right.evaluate
}

val result = new Sum(new Number(200),new Number(300))
result.evaluate



//It is a open ended use polymorphism
// It is a closed ended or bounded use case classes.
