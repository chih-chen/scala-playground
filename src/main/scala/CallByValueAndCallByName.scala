object CallByValueAndCallByName {

  def main(args: Array[String]) {

    // cbv
    def square(x: Int, y: Int) = x * x
    println(square(1 + 1, 3))

    // cbn
    def squareCbn(x: => Int, y: => Int) = x * x
    println(squareCbn(1 + 1, 3))
  }
}