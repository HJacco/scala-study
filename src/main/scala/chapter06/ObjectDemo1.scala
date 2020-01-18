package chapter06

object ObjectDemo1 extends App {
  println("扩展app")
  if(args.length > 0)
    println("1")
  else
    println("3")

  println(Enum.Green)
}
