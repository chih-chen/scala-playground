object CallByValueAndCallByName {

  def main(args: Array[String]) {

    def loop: Int = loop


    // cbv - evaluated to termination, if possible
    {
      def square(x: Int, y: Int) = x * x

      println(square(1 + 1, 3))
    }

    // cbn - not evaluated until reached
    {
      def squareCbn(x: => Int, y: => Int) = x * x

      // it works because `loop` is not reached
      println(squareCbn(1 + 1, loop))
    }

    // val - right-hand side of val is evaluated at the point of definition itself
    {
      // this causes infinite loop, try it on REPL
      // val byValue = loop
    }

    // def - evaluated on each use, try it on REPL
    {
      def byName = loop
      // this is ok
    }

  }
}