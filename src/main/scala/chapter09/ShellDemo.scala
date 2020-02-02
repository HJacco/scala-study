package chapter09

import sys.process._

object ShellDemo {
  def main(args: Array[String]): Unit = {
    "ls -al" #| "grep git"!;

    "ls -al" !!;
  }
}
