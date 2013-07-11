package com.redpantssoft.examples

object fizzBuzz {

  def apply(): Map[Int, String] = {

    (1 to 100).flatMap {
      n =>
        val s = new StringBuilder
        if (n % 3 == 0) s.append("fizz")
        if (n % 5 == 0) s.append("buzz")
        if (!s.isEmpty)
          (n, s.toString()) :: Nil
        else
          Nil
    }.toMap
  }

  def main(args: Array[String]) {
    val f = fizzBuzz()
    (1 to 100).foreach(n => println(
      f.get(n) match {
        case Some(s) => s
        case None => n
      }))
  }

}
