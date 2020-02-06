package chapter14

object MatchDemo {
  def main(args: Array[String]): Unit = {
    var sign = 10
    val ch : Char = '1'

    ch match {
      case '+' => sign = 1
      case '-' => sign = -1
        //等效default
      case _ => sign = 0
    }
    println(sign)

    sign = ch match {
      case '+' => 1
      case '-' => -1
      case _ => 0
    }
    println(sign)

    //守卫
    ch match {
      case '-' => sign = 1
      case '+' => sign = -1
      case _ if Character.isDigit(ch) => sign = Character.digit(ch, 10)
      case _ => sign = 0
    }
  }
}
