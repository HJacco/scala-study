package chapter04

import scala.collection.mutable

object MappingDemo {
  def main(args: Array[String]): Unit = {
    //创建映射  默认是不可变map
    var scores : Map[String, Int] = Map("Alice" -> 10, "Bob" -> 20)
    println(scores)

    //映射是键值对集合，所以可以用以下方式创建映射
    val m = Map(("Allice", 10), ("abc", 20))

    //读取map中的值
    val v1 = scores("Bob")
    println(v1)

    val v2 = scores.getOrElse("B", 0)
    println(v2)

    val mutableMap = mutable.Map("a"->1, "b"->2)
    mutableMap("a") = 3
    println(mutableMap.getOrElse("a", 10))

    //使用 += 添加多个关系
    mutableMap += ("c" -> 3, "d"->9)
    println(mutableMap("d"))

    //移除一个元素
    mutableMap -= "c"
    println(mutableMap.getOrElse("c", 0))

    //迭代映射
    for((k, v) <- mutableMap) {
      print(k + "=" + v)
      println()
    }

    //迭代值
    for (v <- mutableMap.values) {
      print(v + " ")
    }

    println()
    //迭代键
    for (k <- mutableMap.keys) {
      print(k + " ")
    }
  }
}
