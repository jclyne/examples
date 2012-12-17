package com.redpantssoft.examples

object findTheFirstNonRepeatedChar {

  def apply(str: String): Option[Char] = {
    var repeated = Map[Char, Boolean]()
    str.foreach {
      c =>
        if (repeated.contains(c))
          repeated += ((c, true))
        else
          repeated += ((c, false))
    }
    str.find(!repeated(_))
  }
}
