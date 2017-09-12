//a
import java.awt._
val rec = new Rectangle(5,10,20,30)
rec.translate(10,20)
rec.toString

//b

import java.awt.geom._
val ellipse = new Ellipse2D.Double(5,10,20,30)
ellipse.translate(10,20)
ellipse.toString