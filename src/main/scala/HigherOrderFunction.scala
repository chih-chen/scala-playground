import scala.annotation.tailrec

object HigherOrderFunction {

  def main(args: Array[String]): Unit = {

    def sum(a: Int, b: Int, by: Int => Int): Int = {

      @tailrec
      def doSum(a: Int, acc: Int): Int = {
        if (a > b)
          acc
        else
          doSum(a + 1, acc + by(a))
      }

      doSum(a, 0)
    }

    def sumIntsBetween(a: Int, b: Int): Int = sum(a, b, x => x)

    def sumCubesBetween(a: Int, b: Int): Int = sum(a, b, { x: Int => x * x * x })

    println(sumIntsBetween(1, 2))
    println(sumCubesBetween(1, 88))
  }
}
