//Proper Answer
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

import java.awt.geom._
val ellipse = new Ellipse2D.Double(5,10,20,30) with RectangleLike
ellipse.translate(10,20)
ellipse.toString 