import java.io.{FileInputStream, InputStream}

trait Logger {
  def log(message: String) {}
}

trait ConsoleLogger extends Logger {
  override def log(message: String): Unit = {
    println(f"Console logging [ ${message} ] ")
  }
}


trait Buffered extends InputStream with Logger {
  val SIZE = 1024
  private var end = 0
  private var buffer = new Array[Byte](SIZE)
  private var pos = 0


  override def read() = {

    if (pos == end) {
      log("Buffer is empty")
      end = super.read(buffer, 0, SIZE)
    }

    if (pos == end) -1
    else {
      pos += 1
      buffer(pos - 1)
    }
  }
}


val dictionary = new FileInputStream("/usr/share/dict/cracklib-small")
  with Buffered with ConsoleLogger

dictionary.read()
dictionary.read()
dictionary.read()