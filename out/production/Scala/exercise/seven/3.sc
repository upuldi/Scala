//a

abstract class Item

case class Article(description: String, price: Double) extends Item
case class Bottle(description: String, price: Double) extends Item
case class Bundle(description: String, discount: Double, items: Item*) extends Item

val scalaForImpation = Article("Scala For Impation", 39.95)
val bottle = Bottle("Wiskey",50)
val gift = Bundle("Book and Wisky", 10, scalaForImpation, bottle)

def price(i:Item):Double = i match {
  case Article(_,p) => p
  case Bottle(_,p) => p
  case Bundle(_,_,items) => price(items)
  case _  => -1
}

println(price(scalaForImpation))
println(price(bottle))
println(price(gift)) // this solution is incorrect


//Proper solution

def priceProper(i:Item):Double = i match {
  case Article(_,p) => p
  case Bottle(_,p) => p
    //Items in the sequence is being held by the special operator
  case Bundle(_,dis, items @ _*) => items.map( x => priceProper(x) ).sum
  case _  => -1
}
println(priceProper(gift))


