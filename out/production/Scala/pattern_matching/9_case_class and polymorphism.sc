//Recursive data structures can be build with case classes
//Consider following example

abstract class Expression
case class Number(value:Integer) extends Expression
case class Sum(left:Expression,right:Expression) extends Expression
case class Product(left: Expression, right: Expression) extends Expression

//This is called a recursive expression as the Sum and Product contains Number Expression itself


val e = Product(Number(3),Sum(Number(10),Number(20)))

//See how to evaluate the expression
def evaluate(e:Expression):Int = e match  {
  case Number(v) => v
  case Sum(x,y) => evaluate(x) + evaluate(y)
  case Product(p,q) => evaluate(p) * evaluate(q)
}

e
evaluate(e)



