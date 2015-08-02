package com.jono.app.game

/**
 * Created by jono on 1/08/15.
 */
class Board (_size: Int, _camels: List[Camel] ) {
  def size = _size
  def camels = _camels
  override def toString(): String = "Board size: " + _size + "\n" + camels.map(camel => camel.toString())
}

object Board {
  def UpdateBoard(camel: Camel, diceResult: DiceResult, board: Board) =
    board.camels match {
      case (head: Camel) :: _ if head.id == camel.id => "Got camel" + head.id
      case _ => "nothing"
    }
}