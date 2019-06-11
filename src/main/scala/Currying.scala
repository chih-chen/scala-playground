object Currying {

  def main(args: Array[String]): Unit = {

    def sumIntervalOf(of: Int => Int): (Int, Int) => Int = {
      def sum(a: Int, b: Int): Int = {
        if (a > b) 0 else of(a) + sum(a + 1, b)
      }

      sum
    }

    println(sumIntervalOf(x => x * x)(1, 3))

    // syntax sugar version
    def sumIntervalOfSugar(of: Int => Int)(a: Int, b: Int): Int = {
      if (a > b) 0 else of(a) + sumIntervalOfSugar(of)(a + 1, b)
    }

    println(sumIntervalOfSugar(n => n * n)(1, 3))
  }
}