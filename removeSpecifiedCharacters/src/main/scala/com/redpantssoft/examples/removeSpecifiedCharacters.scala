package com.redpantssoft.examples

object removeSpecifiedCharacters {
  def apply(str: String, remove: String): String = {
    val s = str.toCharArray
    val r = remove.toSet

    var to = 0
    s.foreach {
      ch =>
        if (!r.contains(ch)) {
          s(to) = ch
          to += 1
        }
    }
    new String(s.slice(0, to))

  }

}
