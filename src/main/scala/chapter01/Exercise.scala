package chapter01

import scala.math._

object Exercise {
  def main(args: Array[String]): Unit = {
    //计算
    val sqrtValue : Double = sqrt(3)
    println(sqrtValue)

    val squareValue = sqrtValue * sqrtValue
    println(3 - squareValue)

    //apply的方法  是对()操作符的重载
    val str : String = "hello"
    println(str(1))
    println(str.apply(1))

    println(10 max 2)

    val bigInt : BigInt = BigInt(2)
    println(bigInt.pow(1024))


  }
}
