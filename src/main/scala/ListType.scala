object ListType {
  def main(args: Array[String]): Unit = {

    val list1 = List(1, "list1")

    println(list1)

    val list2 = 2 :: "list2" :: 2.3 :: Nil

    println(list2)

    val partialList2 = list2 match {
      case p::ps => s"$p && $ps"
    }

    println(partialList2)

    val emptyList = Nil

    println(emptyList)

    val concatenate = list1 ::: list2

    println(concatenate)

    val concatenate2 = list1 ++ list2

    println(concatenate2)

  }
}