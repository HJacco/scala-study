package chapter12

import scala.math._

object HighFunctionDemo {
  def main(args: Array[String]): Unit = {
    val f = ceil _
    println(f(0.25))

    //匿名函数，并将函数赋值给变量anousFun
    val anousFun = (x : Double) => x * 3
    println(anousFun(4))
    //带函数参数的函数
    //接受一个 Double=》Double的函数
    def valueAtOneQuarter(m : (Double) => Double) = m(0.25)
    println(valueAtOneQuarter(ceil _))

    //柯里化 将原来接受两个参数的函数转换成接受一个参数的函数的过程
    def mul(x : Int, y : Int) = x * y

    def mulOntAtTime(x : Int) = (y : Int) => x * y
    println(mulOntAtTime(7)(6))

  }
}
