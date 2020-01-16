package Chapter03

import scala.collection.mutable.ArrayBuffer

object ArrayDemo {
  def main(args: Array[String]): Unit = {
    //长度不变的数组
    var nums = new Array[Int](10)

    var a = Array(2, 1)
    a(0) = 4
    for(i <- a){
      println(i)
    }
    println(a(0))


    //空的变长数组  等效于java中的ArrayList
    val b = ArrayBuffer[Int]()
    b += 1
    println(b.length)
    b += (1, 2, 3,4,5)

    b ++= Array(8, 10, 4)

    //可以转换成一个定长数组
    b.toArray

    //求数组最大值
    val maxValue = b.max
    println(maxValue)

    //多维数组
    //3行四列
    val matrix = Array.ofDim[Double](3, 4)
    //访问二位数组的元素
    val ele = matrix(0)(0)
    println(ele)
  }
}
