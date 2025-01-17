package com.vinctus.oql

import java.time.Instant

object ScalaConversions extends Conversions {

  def timestamp(t: String): Any = Instant.parse(if (t endsWith "Z") t else t :+ 'Z')

  def uuid(id: String): Any = id

  def bigint(n: String): Any = n.toLong

  def decimal(n: String, precision: Int, scale: Int): Any = BigDecimal(n).setScale(scale)

//  def jsonNodePG(v: String): Any = JSON.readValue(v)  // todo: target independent JSON handling

  def jsonSequence(v: Any): Any = v

}
