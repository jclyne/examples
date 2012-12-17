package com.redpantssoft.examples


object char2Int {
  val zero = '0'.toInt

  def apply(in: Char) = in.toInt - zero
}

object int2Char {
  val zero = '0'.toInt

  def apply(in: Int) = (in + zero).toChar
}

object str2Int {

  def apply(str: String, base: Int = 10): Int = {

    def convert(in: String, out: Int): Int = {
      if (!in.isEmpty)
        convert(in.tail, out * base + (char2Int(in.head)))
      else
        out
    }

    if (str.startsWith("-"))
      0 - convert(str.tail, 0)
    else
      convert(str, 0)
  }
}

object int2Str {
  def apply(int: Int, base: Int = 10): String = {

    def convert(in: Int, out: StringBuilder): StringBuilder = {
      if (in > 0)
        convert(in / base, out.append(int2Char(in % base)))
      else
        out.reverseContents()

    }

    val out = convert(math.abs(int), new StringBuilder)
    if (out.isEmpty)
      "0"
    else if (int < 0)
      "-" + out.mkString
    else
      out.mkString
  }
}
