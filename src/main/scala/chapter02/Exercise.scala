package chapter02

/**
  * 第二章练习题
  */
object Exercise {
  def main(args: Array[String]): Unit = {
    // {} 的值是(), 类型是Unit
    println({}.isInstanceOf[Unit])

    //scala中赋值操作是Unit, 所以x是Unit
    var y = 0
    val x = y = 1
    println(x.isInstanceOf[Unit])


  }

  def judgeNum(x : Double) : Double = {
    if(x > 0)
      1
    else if(x < 0)
      -1
    else
      0
  }
}
