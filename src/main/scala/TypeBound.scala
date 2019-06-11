object TypeBound {
  def main(args: Array[String]): Unit = {

  }
}

// S is subtype of Any
class SubType[S <: Any]

// S is superType of Int, or Int is subtype of S
class SuperType[S >: Int]

class Mixed[S >: Int <: Any]