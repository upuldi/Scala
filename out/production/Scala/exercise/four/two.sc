class Time(h:Int,m:Int) {

  private val noOfMinutesSinceMidnight = h * 60 + m

  def hours = noOfMinutesSinceMidnight / 60
  def minutes = noOfMinutesSinceMidnight % 60

  if(h < 0 || m < 0 ) throw new IllegalArgumentException

  //OR you can keep the same logic as it is
  def before(other:Time) = hours < other.hours ||
    hours == other.hours && minutes < other.minutes

  override def toString = f"Hour is ${hours} and Minute is ${minutes}%02d"
}

val x = new Time(11,55)
val y = new Time(23,55)
x before(y)

val z  = new Time(12,-10)
