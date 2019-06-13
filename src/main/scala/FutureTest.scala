import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.Future

object FutureTest {
  def main(args: Array[String]): Unit = {

    case class Coffee(name: String)

    def coffeeBreak(): Future[Unit] = {
      val drunkCoffee = makeCoffee()
      val chatted = chat()

      (drunkCoffee zip chatted).map(_ => Unit)
    }

    def makeCoffee(): Future[Coffee] = {
      println("Making coffee...")
      Thread.sleep(5000)
      Future(Coffee("Cappuccino"))
    }

    def chat(): Future[Unit] = {
      println("Chatting...")
      Future()
    }

    coffeeBreak()
  }
}


