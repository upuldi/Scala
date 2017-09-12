//Case class can be used in a case statement for pattern matching
//It is a class that is optimized to used in pattern matching
abstract class Amount
case class Dollar(value:Double) extends Amount
case class Currency(value:Double,unit:String) extends Amount
case object Nothing extends Amount //Here we have a object



def caseClassPatternDemo(x:Amount): String = {
 return x match {

    case Dollar(v) => s"value is  ${v} dollars"
    case Currency(v,_) => s"Unit is not interested (_) and amount is ${v} "
    case Nothing => "Nothing"
  }
}
println(caseClassPatternDemo(new Dollar(100)))
println(caseClassPatternDemo(Dollar(500)))
println(caseClassPatternDemo(new Currency(100,"Ruppes")))
println(caseClassPatternDemo(Currency(100,"Ruppes")))

//Case class points
// 1. Everything has to extends from the same super class
// 2. Constructor parameters becomes val (immutable objects)
// 3. Automatically provides the companion object and gets
//    the apply factory method Dollar(100) instead of new Dollar(100)
// 4. Methods toString(), equals(), hashCode(), unapply() and copy() are generated

// unApply() -> is the method used in underline to make the extractors work
// copy() -> is used to copy values

// copy() Method
val original = Currency(1,"AUD")
val cloned = original.copy()
val copingWhileChanging = original.copy(value = 400)
val copingWhileChangingAll = original.copy(value = 400,unit = "Rs")

//Definition
//Case classes can be seen as
// plain and immutable data-holding
// objects that should exclusively depend on their constructor arguments.