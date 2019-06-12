object ForExpression {
  def main(args: Array[String]): Unit = {

    def isPrime(n: Int) = (2 until n) forall (i => n % i != 0)

    val primes = for {
      i <- 1 until 7
      j <- 1 until i
      if isPrime(i + j)
    } yield (i, j)
    println(primes)

    val ages = List(14, 51, 62)
    val agesAbove18 = for {
      age <- ages
      if age > 18
    } yield age
    println(agesAbove18)

  }
}
