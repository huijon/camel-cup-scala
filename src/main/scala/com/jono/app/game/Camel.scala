package com.jono.app.game

/**
 * Created by jono on 2/08/15.
 */
class Camel (_id: Int, _colour: String) {
  def id = _id
  def colour = _colour
  override def toString: String = "Camel " + id + " is " + colour
}
