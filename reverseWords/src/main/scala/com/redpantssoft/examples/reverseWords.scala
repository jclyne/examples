package com.redpantssoft.examples


object reverseWords {
  def apply(str: String): String = {
    val s = str.toCharArray
    val res = new StringBuilder

    var end = s.length
    var start = end

    s.reverse.foreach {
      ch =>
        start -= 1
        if (ch == ' ') {
          res.appendAll(s.slice(start + 1, end))
          res.append(' ')
          end = start
        } else if (start == 0) {
          res.appendAll(s.slice(start, end))
        }
    }
    res.mkString
  }

}
