import scala.annotation.tailrec

object Factorial {
  def main(args: Array[String]): Unit = {

    def factorial(n: Int): Int = {

      @tailrec
      def loop(acc: Int, n: Int): Int = {
        if (n == 0) acc
        else loop(acc * n, n - 1)
      }

      loop(1, n)
    }

    println(factorial(4))
  }
}