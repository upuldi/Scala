class Time(val hours:Int, val minutes:Int = 0) {

  if ( hours > 23 || hours < 0)  throw new IllegalArgumentException
  if ( minutes > 59 || minutes < 0) throw new IllegalArgumentException

  //def this(h:Int) = this(h,0)


  override def toString = f"Hour is ${hours} and Minute is ${minutes}"

  def before(other:Time) = hours < other.hours || hours == other.hours && minutes < other.minutes
}

val x = new Time(11,55)
val y = new Time(23,55)
x before(y)
x before y

val z  = new Time(12,-10)

val noon = new Time(12)