package com.redpantssoft.examples

import org.junit.runner._
import org.scalatest.junit.JUnitRunner
import org.scalatest.FunSpec
import org.scalatest.matchers.ShouldMatchers

@RunWith(classOf[JUnitRunner])
class FindTheFirstNonRepeatedCharSpec extends FunSpec with ShouldMatchers {

  describe("The findTheFirstNonRepeatedChar function") {

    it("should return 'o' for the string 'total'") {
      findTheFirstNonRepeatedChar("total") should be(Some('o'))
    }

    it("should return 'r' for the string 'teeter'") {
      findTheFirstNonRepeatedChar.apply("teeter") should be(Some('r'))
    }

    it("return None for the string 'tomtom' ") {
      findTheFirstNonRepeatedChar("total") should be(None)
    }
  }
}
