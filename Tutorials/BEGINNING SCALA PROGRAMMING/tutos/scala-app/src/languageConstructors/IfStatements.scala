//If Statements Demo

val checkingValue = 10;
var result = "";

if(checkingValue>10) result = "Value is greater than 10";
else if(checkingValue<10) result = "Value is less than 10";
else result = "Value is 10";

println(result);

//See in the above example you have to use a var which is not encouraged in scala, see this  approach.

val newResultVal =  if(checkingValue > 10) "new Value is greater than 10"
                    else if (checkingValue < 10) "new Value is less than 10"
                    else "new Value is 10";

println(newResultVal);//We eleminated the use of var