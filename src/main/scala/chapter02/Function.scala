package chapter02

/**
  * 在scala中
  * 1、方法是类的组成部分，不能单独存在，而函数是一个完整的对象，可以赋值给一个变量
  * 2、函数必须有参数列表，而方法可以没有参数列表
  * 3、方法名是方法调用，而函数名只是代表函数对象本身
  * 4、在需要函数的地方，如果传递一个方法，会自动进行ETA展开（把方法转换为函数）
  * 5、传名参数本质上是个方法
  */
object Function {
  def main(args: Array[String]): Unit = {
    def abs(x : Double) : Double = {
      if( x > 0) x else -x
    }

    println(abs(-1))

    //递归必须指定返回类型
    def fac (n : Int) : Int = {
      if(n == 1 || n == 2) {
        1
      } else {
        fac(n - 1) + fac(n - 2)
      }
    }
    println(fac(5))
    def f = fac _
    println(f(5))

    //函数可以定义默认参数
    def decorate(str : String, left : String = "[", right : String = "]") : String = {
      left + str + right
    }

    println(decorate("Jacco"))
    println(decorate("Jacco", right = ")"))

    //变长参数需要放在参数列表末尾
    def sum(args : Int*) : Int = {
      println("执行函数sum")
      var  sum = 0
      for (arg <- args) {
        sum += arg
      }
      sum
    }
    println(sum(1,2,3 ))

    //没有任何返回值可以把unit=省去
    def box(s : String): Unit = {
      println(s)
    }

    //懒值 延迟初始化
    lazy val s = sum(1,3,5)
    println("暂时不访问变量s")
    println("访问变量s=" + s)
    println("第二次访问变量s=" + s)

    def processException(x : String): String = {
      if(x.length > 1) {
        x
      } else {
        throw new Exception("参数错误")
      }
    }

  }

}
