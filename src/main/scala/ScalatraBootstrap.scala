import com.jono.app._
import com.jono.app.game.{DiceResult, Camel, Board}
import org.scalatra._
import javax.servlet.ServletContext

class ScalatraBootstrap extends LifeCycle {

  println("\n\n--------------------------BEGIN--------------------------")

  val camels: List[Camel] = List(
    new Camel(1, "blue"),
    new Camel(2, "red"),
    new Camel(3, "green"),
    new Camel(4, "yellow"),
    new Camel(5, "white")
  )

  val board = new Board(13, camels)
  println(board);

  val updatedBoard = Board.UpdateBoard(camels(3), new DiceResult(3), board)

  println("UPDATED: ", updatedBoard)

  println("---------------------------END---------------------------\n\n")

  override def init(context: ServletContext) {
    context.mount(new CamelCupServlet, "/*")
  }
}
