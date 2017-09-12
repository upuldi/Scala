abstract class Item

case class Article(description: String, price: Double) extends Item
case class Bottle(description: String, price: Double) extends Item
case class Bundle(description: String, discount: Double, items: Item*) extends Item

val special = Bundle( "someSpecial", 20, Article("Scala for impation", 39.95),
  Bundle("another Special",10, Article("Wiskey",79.95),Article("gin", 32.95)))


//Extract only one out of something
val Bundle(_,_,Article(des,pri), _*) = special