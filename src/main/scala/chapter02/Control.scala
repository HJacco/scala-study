package chapter02

import scala.io.StdIn
import scala.util.control.Breaks

object Control {
  def main(args: Array[String]): Unit = {
    //条件控制语句
    val x = 1

    var s = if (x > 0) () else 2

    println(s)

    /**
      * 代码块最后一个表达式的值就是块的值
      */
    val area: Double = {
      val l = 1.2
      val w = 2.1
      l * w
    }
    println(area)

    //使用readLine从控制台读取输入的值
    print("请输入你的姓名：")
    val name = StdIn.readLine()
    println(name)

    //循环
    for (i <- 1 to 10) {
      print(i + ",")
    }
    println()

    for (i <- 1 until 10) {
      print(i + ",")
    }
    println()

    //控制步长的for循环
    for (i <- Range(1, 10, 2)) {
      print(i + ",")
    }
    println()

    //break
    Breaks.breakable {
      for (i <- Range(1, 10, 2)) {
        if (i == 5) {
          Breaks.break
        }
        print(i + ",")
      }
    }
    println()

    //continue
    for (i <- 1 to 10) {
      Breaks.breakable {
        if(i % 2 == 0) {
          Breaks.break
        }
        print(i + ",")
      }
    }
    println()

    //高级for循环
    for(i <- 1 to 3; j <- 1 to 3) {
      print((10 * i + j) + " ")
    }
    println()

    //循环可以带有守卫
    for(i <- 1 to 10 if i % 2 != 0) {
      print(i + " ")
    }

    println()

    for {
      i <- 1 to 3
      from = i
      j <- from to 7
    }{
      print((i * 10 + j) + " ")
    }
  }
}
