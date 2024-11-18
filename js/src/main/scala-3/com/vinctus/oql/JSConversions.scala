package com.vinctus.oql

import com.vinctus.sjs_utils.toJS

import scala.scalajs.js

object JSConversions extends Conversions {

  def timestamp(t: String): Any = new js.Date(s"$t+00:00")

  def uuid(id: String): Any = id

  def bigint(n: String): Any = js.BigInt(n)

  def decimal(n: String, precision: Int, scale: Int): Any = n.toDouble

//  def jsonNodePG(v: String): Any = js.JSON.parse(v)   // todo: target independent JSON handling

  def jsonSequence(v: Any): Any = toJS(v)
}
