package com.vinctus.oql

import scala.scalajs.js

object PlatformSpecific {
  def isUndefined(x: Any): Boolean = x.asInstanceOf[js.Any] == js.undefined

  def typeOf(value: Any): String = js.typeOf(value.asInstanceOf[js.Any])

  def isJsObject(value: Any): Boolean = value.isInstanceOf[js.Object]

  def isJsArray(value: Any): Boolean = value.isInstanceOf[js.Array[?]]

  def jsArrayToSeq(value: Any): Seq[?] = value.asInstanceOf[js.Array[?]].toSeq

  def jsDictionaryToSeq(value: Any): Seq[(String, Any)] = value.asInstanceOf[js.Dictionary[Any]].toSeq
}
