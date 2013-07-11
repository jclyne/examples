package com.redpantssoft.examples

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner
import org.scalatest.FunSpec
import org.scalatest.matchers.ShouldMatchers


@RunWith(classOf[JUnitRunner])
class FizzBuzzTest extends FunSpec with ShouldMatchers {

  def divBy(div: Int)(n: Int) = (n % div) == 0
  val divBy5 = divBy(5)_
  val divBy3 = divBy(3)_

  describe("The fizzBuzz function") {

    it("should generate a map for every number between 1-100 prints out \"fizz\" if it's a multiple of 3, " +
      "\"buzz\" if it's a multiple of 5, and \"fizzbuzz\" if it's a multiple of 3 and 5. ") {

      val res = fizzBuzz()

      (1 to 100).foreach { n =>
        if ( divBy3(n) && divBy5(n) ) {
          res.get(n).size should be(1)
          res.get(n).foreach ( _ should be("fizzbuzz"))
        } else if ( divBy3(n) ) {
          res.get(n).size should be(1)
          res.get(n).foreach ( _ should be("fizz"))
        } else if ( divBy5(n) ) {
          res.get(n).size should be(1)
          res.get(n).foreach ( _ should be("buzz"))
        } else {
          res.get(n).size should be(0)
        }
      }
    }
  }
}
