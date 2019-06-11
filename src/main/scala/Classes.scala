object Classes {
  def main(args: Array[String]): Unit = {
    println(f.apply(10))
  }

  // function are objects
  // anonymous class
  val f = new (Int => Int) {
    override def apply(v1: Int): Int = v1
  }

}