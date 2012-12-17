package com.redpantssoft.examples


object stringPermutations {

  def apply(str: String): List[String] = {
    var res: List[String] = Nil

    def permute(in: String, out: String) {
      val len = in.length
      if (len > 0) {
        (0 until len).foreach {
          case pos => permute(
            in.slice(0, pos) +
              in.slice(pos + 1, len),
            out + in(pos))
        }
      }
      else
        res = out.mkString :: res
    }

    permute(str, "")
    res
  }

}
