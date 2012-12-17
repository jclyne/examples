package com.redpantssoft.examples

import org.scalatest.path.FunSpec
import org.scalatest.matchers.ShouldMatchers
import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class StringPermutationsSpec extends FunSpec with ShouldMatchers {

  def factorial(x: Int): Int = ((1 to x) :\ 1)(_ * _)

  implicit def factorialAble(x: Int) = new {
    def ! = ((1 to x) :\ 1)(_ * _)
  }

  def testStringPermutations(str: String, perms: Set[String]) {
    val res = stringPermutations(str)
    res.size should equal(str.size !)
    res.toSet should equal(perms)
  }

  describe("The stringPermutations function") {
    it("should return all the permutations of a string") {
      testStringPermutations("hat", Set[String]("tha", "aht", "tah", "ath", "hta", "hat"))
      testStringPermutations("aaa", Set[String]("aaa"))

    }
  }
}
