//Map applies a function to the each element of a sequence
(1 to 9).map(10 * _)
(1 to 9).map( (x:Int) => x * 100)

//Filter retails the elements fulfilling a predicate
(1 to 9).filter( _ % 2 == 0 )
(1 to 9).filter((x:Int) => x % 2 == 0 )


//reduceLeft applies a binary function with two arguments,
// going from left to right
(1 to 9).reduceLeft(_ * _)
(1 to 9).reduceLeft( (x:Int,y:Int) => x*y  )


//Map is the exactly the same thing as the for yield
//Filter is the guard condition of the for yield
(1 to 9).filter(_ % 2 == 0).map(_ * 10)
for(x <- 1 to 9; if x % 2 == 0) yield x * 10
