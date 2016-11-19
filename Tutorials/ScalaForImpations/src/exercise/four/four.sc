class Time(h:Int,m:Int) {

  private var noOfMinutesSinceMidnight = h * 60 + m

  def hours = noOfMinutesSinceMidnight / 60
  def minutes = noOfMinutesSinceMidnight % 60

  if(h < 0 || m < 0 ) throw new IllegalArgumentException

  override def toString = f"Hour is ${hours} and Minute is ${minutes}"

  def before(other:Time) = hours < other.hours ||
    hours == other.hours && minutes < other.minutes

  //Accessor Mutation method
  def minutes_=(newValue:Int) = {
    if (newValue < 0 || newValue > 59) throw new IllegalArgumentException
    noOfMinutesSinceMidnight = hours * 60 + newValue
  }

}

val x = new Time(11,55)
val y = new Time(23,55)
x before(y)

//val z  = new Time(12,-10)

x.minutes = 57
x