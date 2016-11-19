//Infix Notation x op y is same as x.Op(y)
class TempDemoClass {

  1 to 10 map(3*_) filter (_ % 5 == 2)

  //The above statement can be written as
  1.to(10).map(3*_).filter(_ % 5 == 2)
}

// You can define any operator in your class

class MyClassWithOperators(val x:Int, val y:Int) {

  def someDubmMethod = f"I am a dumb method with ${x} and ${y}"

  //Define an operator at your class
  def +(someInt:Int) = new MyClassWithOperators(x+someInt,y)

  //crazy operator
  def ***(xx:Int,yy:Int,zz:Int) = new MyClassWithOperators(x*xx*zz,y*yy*zz)

  def ++(a:MyClassWithOperators) = new MyClassWithOperators(x +a.x, y + a.y )
}

val x = new MyClassWithOperators(10,20)
x.someDubmMethod

val y = x + 100
y.someDubmMethod

val z = x.***(10,20,30)
val anotherWay = x ***(10,20,30)


//Another operators demo
val oneObj = new MyClassWithOperators(10,20)
val twoObj = new MyClassWithOperators(30,40)

val three = oneObj ++ twoObj
three.someDubmMethod

// : Operator is right associative all other operatos are left associative

//To apply the function call notation define apply() method in the class

class MyTestClassWithFunctionCallNotation(x:Int) {

  //Apply method is the default method on the class which get executed..
  def apply(y:Int) = new MyTestClassWithFunctionCallNotation(x*y)

  def someDubmMethod = f"I am a dumb method with ${x}"
}

val aa = new MyTestClassWithFunctionCallNotation(10)
val bb = aa(10)
bb.someDubmMethod