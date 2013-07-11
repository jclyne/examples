package com.redpantssoft.examples

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner
import org.scalatest.FunSpec
import org.scalatest.matchers.ShouldMatchers

@RunWith(classOf[JUnitRunner])
class FibonnaciTest extends FunSpec with ShouldMatchers {
  describe("The fibonnaci function") {

    it("should return a proper fibonnaci sequence") {
      fibonnaci(0) should be(0)
      fibonnaci(1) should be(1)
      (2 to 1000). foreach { n =>
        fibonnaci(n) should be(fibonnaci(n-1) + fibonnaci(n-2))
      }
    }
  }
}
