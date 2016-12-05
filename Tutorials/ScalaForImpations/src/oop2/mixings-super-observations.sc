trait ParentTraitWithSomeFunctionality {
  def doSomething = println("Parent")
}
trait StringTrait extends ParentTraitWithSomeFunctionality {
  override def doSomething: Unit = {
    println("String")
   // super.doSomething
  }
}
trait IntTrait extends ParentTraitWithSomeFunctionality {
  override def doSomething: Unit = {
    println("Int")
    super.doSomething
  }
}
trait DoubleTrait extends ParentTraitWithSomeFunctionality {
  override def doSomething: Unit = {
    println("Double")
    super.doSomething
  }
}

class ChildClass extends ParentTraitWithSomeFunctionality{
  def customMethod: Unit = {
    println("child")
    doSomething
  }
}

//with super the execution goes to the next trait,Since there is no super defined in the
// String trait it will not go to the ParentTrait
val stringAndIntMixin = new ChildClass with StringTrait with IntTrait
stringAndIntMixin.customMethod

val intAndStringMixin = new ChildClass with IntTrait with StringTrait
intAndStringMixin.customMethod

val stringIntAndDoubleTrait = new ChildClass with StringTrait with IntTrait with DoubleTrait
stringIntAndDoubleTrait.customMethod

