object Mix {

  def main(args: Array[String]): Unit = {

    val pair = (1, 2)
    val triple = (1, 2, 3)
    val many = ("test", 2, 1.0, true)
    println(pair)
    println(triple)
    println(many)

    val range = 1 to 10 by 2
    val range2 = 1 until 10
    println(range)
    println(range2)

    val set1 = Set(1, 1, "f", true)
    println(set1)

    val map1 = Map("I" -> 1, "II" -> 2, "III" -> 3)
    println(map1)
    println(map1("I"))

    val missing = map1.get("missing") match {
      case Some(x) => x
      case None => -1
    }

    println(missing)


  }

}
