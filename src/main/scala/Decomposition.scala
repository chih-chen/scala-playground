object Decomposition {
  def main(args: Array[String]): Unit = {

    val exp = Sum(Num(10), Num(4))

    println(s"${exp.show()} = ${exp.eval()}")
  }
}

trait Exp {
  def eval(): Int = this match {
    case Num(x) => x
    case Sum(a, b) => a.eval + b.eval
  }

  def show(): String = this match {
    case Num(x) => x.toString
    case Sum(a, b) => s"${a.show()} + ${b.show()}"
  }
}

case class Num(n: Int) extends Exp {
  //  or ... override def eval(): Int = n
}

case class Sum(n1: Exp, n2: Exp) extends Exp {
}