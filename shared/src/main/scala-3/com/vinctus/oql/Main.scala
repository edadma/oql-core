package com.vinctus.oql

import scala.scalajs.js
import scala.scalajs.js.Dynamic.global as g

object Main extends App {

  g.require("source-map-support").install() // so we get more informative stack traces
  types.setTypeParser(114.asInstanceOf[TypeId], (s: String) => s) // tell node-pg not to parse JSON

}
