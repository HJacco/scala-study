package chapter06

object Enum extends Enumeration {
  //声明枚举对外暴露的变量类型
  type Enum = Value

  val Red = Value(1)
  val Yellow = Value(2)
  val Green = Value(3)
}
