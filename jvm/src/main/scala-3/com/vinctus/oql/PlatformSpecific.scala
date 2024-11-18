package com.vinctus.oql

object PlatformSpecific {
  def isUndefined(x: Any): Boolean = false

  def typeOf(value: Any): String = null

  def isJsObject(value: Any): Boolean = false

  def isJsArray(value: Any): Boolean = false

  def jsArrayToSeq(value: Any): Seq[?] = ???

  def jsDictionaryToSeq(value: Any): Seq[(String, Any)] = ???
}
