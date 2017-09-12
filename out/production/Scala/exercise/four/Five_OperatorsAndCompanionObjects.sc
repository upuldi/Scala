class Time(h: Int, m: Int) {

  private var noOfMinutesSinceMidnight = h * 60 + m

  def hours = noOfMinutesSinceMidnight / 60

  def minutes = noOfMinutesSinceMidnight % 60

  if (h < 0 || m < 0) throw new IllegalArgumentException

  override def toString = f"Hour is ${hours} and Minute is ${minutes}"

  def <(other: Time) = this - other < 0

  def -(other: Time) = noOfMinutesSinceMidnight - other.hours * 60 - other.minutes

  //Accessor Mutation method
  def minutes_=(newValue: Int) = {
    if (newValue < 0 || newValue > 59) throw new IllegalArgumentException
    noOfMinutesSinceMidnight = hours * 60 + newValue
  }
}

object Time {
  def apply(h: Int, m: Int) = new Time(h, m)
}

val x = new Time(11, 55)
val y = new Time(23, 55)
x < y

//val z  = new Time(12,-10)

x.minutes = 57
x

val z = y - x
z

val ox = Time(8, 55)
ox

