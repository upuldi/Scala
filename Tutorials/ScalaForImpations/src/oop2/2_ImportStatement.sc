// Instead of the * Scala uses _ to import all the inside a package

//This is similar to import java.util.* in Java
import java.util._

//There is no specific static import in Scala, _ will work similarly
import java.lang.Math._ // Will static import all

//Import only selected members
import java.awt.{color,font} // Here I am importing the selected members only

//Also you can provide alias in Scala for importing classes
import java.util.{HashMap => JavaHashMapAliasGivenByMe}

//Also you can exclude classes from importing
//If you want to import everything from java.util package except HashMap
import java.util.{HashMap => _,_}

//You can place the imports in everywhere in Scala
//These local imports will only have the impact on the area where they have the visibility to
//If you want to use a class only inside a class
class MyClass {
  //Now I want Date
  import java.util.Date
  //Here the Date will be visible only inside this class
}

// java.lang and scala,Predef will always imported default in Scala