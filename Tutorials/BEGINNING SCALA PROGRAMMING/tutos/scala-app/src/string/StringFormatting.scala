//Java way
val javaStyleStringFormatting = String.format("*** %s ***","SomeString" );
println(javaStyleStringFormatting);

//Scala way
val someStrinToBeFormatted = "<<< %s >>>".format("AnotherString");
println(someStrinToBeFormatted);

//Same as java format accept any no of parameters
//You can control the order as n$  etc
println("SomeString formatting --- %3$s --- , --- %2$s --- , --- %1$s --- ".format("1","2","3"));

//Time
import java.time._;
println("We will be eating luch in %1$tB the %1$te in the year %1$tY".format(LocalDate.now));

