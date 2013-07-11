package com.redpantssoft.examples

object fibonnaci {

  private val nums: Stream[BigInt] = BigInt(0) #:: BigInt(1) #:: nums.zip(nums.tail).map(n => n._1 + n._2)

  def apply(idx: Int): BigInt = nums(idx)

  def main(args: Array[String]) {
    (0 to args(0).toInt).foreach(n => println(fibonnaci(n)))
  }

}
