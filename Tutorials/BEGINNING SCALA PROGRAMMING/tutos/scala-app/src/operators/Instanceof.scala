//Instance of is defined in Any class

//signature - x.isInstanceOf[Type]

println(3.isInstanceOf[Int]);
//String inherits from Char Sequence..
println("ABCD".isInstanceOf[CharSequence]);


//AsInstanceof is used to cast types
// type.asInstanceOf[Target Type]


val x:Any = "abcdefghijklmnop...";
//casting the superclass Any into a string
val y:String = x.asInstanceOf[String];
println(y);


//its important to check the type using isInstanceOf before asInstanceOf

def myDemoOne(x:Any) = {

  //Check the type
  if(x.isInstanceOf[Int]) {

    //Then do the casting
    x.asInstanceOf[Int] + 1;
  } else {
    -1;
  }
}


println(myDemoOne(10));
println(myDemoOne("String"));
