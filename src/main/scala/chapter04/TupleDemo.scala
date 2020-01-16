package chapter04

/**
  * 元组是不同类型值的集合
  */
object TupleDemo {
  def main(args: Array[String]): Unit = {

    //定义一个元组
    val t1 = (1, 1.2, "string")

    println(t1._1)

    println(t1 _2)

    val symbols = Array("Jacco", "Bob", "Titan")
    val scores = Array(10, 20, 30)

    val pairs = symbols.zip(scores)

  }
}
