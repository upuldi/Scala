trait ParentTraitWithSomeFunctionality {
  def doSomething = println("Parent")
}
trait StringTrait extends ParentTraitWithSomeFunctionality {
  override def doSomething = println("String")
}
trait IntTrait extends ParentTraitWithSomeFunctionality {
  override def doSomething = println("Int")
}
trait DoubleTrait extends ParentTraitWithSomeFunctionality {
  override def doSomething = println("Double")
}

class ChildClass extends ParentTraitWithSomeFunctionality{
  def customMethod: Unit = {
    println("child")
    doSomething
  }
}
//Obj Creation
val stringTrait = new ChildClass with StringTrait
stringTrait.customMethod

val intTrait = new ChildClass with IntTrait
intTrait.customMethod

val doubleTrait = new ChildClass with DoubleTrait
doubleTrait.customMethod

//Mixings

// Executing from right to left, looks like it stop executing once it saw everything is same

// IF IT DOESNT INVOKE THE SUPER() MIXINGS STOP AT THE FIRST INVOCATION

val stringAndIntMixin = new ChildClass with StringTrait with IntTrait
stringAndIntMixin.customMethod

val intAndStringMixin = new ChildClass with IntTrait with StringTrait
intAndStringMixin.customMethod

val stringIntAndDoubleTrait = new ChildClass with StringTrait with IntTrait with DoubleTrait
stringIntAndDoubleTrait.customMethod
