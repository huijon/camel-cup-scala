package com.jono.app.game

import Math.{round, random}

/**
 * Created by jono on 2/08/15.
 */
object Dice {
  def roll() = new DiceResult(round(random * 6).toInt);
}

class DiceResult(res: Int){
  def value = res
}