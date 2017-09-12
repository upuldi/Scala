
//d
trait RectangleLike {
  def setFrame(x:Double, y:Double, width:Double, height:Double)
  def getX:Double
  def getY:Double
  def getWidth:Double
  def getHeight:Double
  def translate(dx: Double, dy: Double) =  {
    setFrame(getX + dx, getY + dy , getWidth, getHeight)
  }
  override def toString = f"x : ${getX} y:${getY} width:${getWidth} height:${getHeight}"
}

class Rectangle(var x:Double, var y:Double, var width:Double, var height:Double)
  extends RectangleLike {

  def getY = y
  def getX = x
  def getWidth = width
  def getHeight = height

  override def setFrame(x: Double, y: Double,
                        width: Double, height: Double) = {
    this.x = x
    this.y = y
    this.width = width
    this.height = height

  }
}

val rec = new Rectangle(5,10,20,30)
rec.translate(10,20)
rec.toString


class Ellipse(x:Double,y:Double,width:Double,height:Double)
  extends RectangleLike {

  def getY = y
  def getX = x
  def getWidth = width
  def getHeight = height

  override def setFrame(x: Double, y: Double,
                        width: Double, height: Double) = {
    new Ellipse(x,y,width,height)
  }
}

val ellipse = new Rectangle(5,10,20,30)
ellipse.translate(10,20)
ellipse.toString

