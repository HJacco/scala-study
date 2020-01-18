package chapter09

import scala.io.Source

object FileDemo {
  def main(args: Array[String]): Unit = {
    //读取一个文件
    val source = Source.fromFile("D:\\projects-pri\\scala-study\\src\\main\\resources\\desc.txt", "UTF-8")

    val lineIterator = source.getLines

    for (l <- lineIterator) {
      println(l)
    }

    //读取整个文件的内容并赋值给一个变量
    val content = source.mkString
    println(content)

    source.close()
  }
}
