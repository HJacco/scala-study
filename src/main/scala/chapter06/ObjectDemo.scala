package chapter06

object ObjectDemo {
  private var lastNumber = 0

  def newUniqueNumber() = {lastNumber += 1; lastNumber}

  def main(args: Array[String]): Unit = {
    println(newUniqueNumber())
  }
}

class Account {
  private var number = 0

  def getName () : String = {
    Account.name + number
  }
}

/**
  * 类Account的伴生对象
  */
object Account {
  private var name = "Jacco"
}
