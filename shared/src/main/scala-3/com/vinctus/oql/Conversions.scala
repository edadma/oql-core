package com.vinctus.oql

abstract class Conversions {

  def timestamp(t: String): Any

  def uuid(id: String): Any

  def bigint(n: String): Any

  def decimal(n: String, precision: Int, scale: Int): Any

//  def jsonNodePG(v: String): Any    // todo: target independent JSON handling

  def jsonSequence(v: Any): Any

}
