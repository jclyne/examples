package com.redpantssoft.examples


object stringCombinations {

  def apply(str: String): List[String] = {
    var res: List[String] = Nil

    def combine(in: String, out: String) {
      val len = in.length
      if (len > 0) {
        (0 until len).foreach {
          case pos => combine(
            in.slice(0, pos) +
              in.slice(pos + 1, len),
            out + in(pos))
        }
      }
      else
        res = out.mkString :: res
    }

    combine(str, "")
    res
  }

}
