object Main {
  def main(args: Array[String]): Unit = {

    val x = new Rational(1, 2)
    val y = new Rational(2, 3)
    val z = new Rational(3)

    println(x add y)
    println(x * y)
    println(x - y)

    println(z)
  }
}

class Rational(private val numerator: Int, private val denominator: Int) {

  def this(numerator: Int) = this(numerator, 1)

  def unary_-() = new Rational(-numerator, denominator)

  def add(other: Rational) =
    new Rational(numerator * other.denominator + other.numerator * denominator, denominator * other.denominator)

  def *(other: Rational) =
    new Rational(numerator * other.numerator, denominator * other.denominator)

  def -(other: Rational) = this add -other

  override def toString: String = s"$numerator/$denominator"

}