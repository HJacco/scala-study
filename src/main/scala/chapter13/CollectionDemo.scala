package chapter13

import scala.collection.mutable

object CollectionDemo {
  def main(args: Array[String]): Unit = {
    var map = mutable.Map(("a", "1"), ("b", "2"))
    print(map("a"))

    val list = List(1, 2)
  }
}
