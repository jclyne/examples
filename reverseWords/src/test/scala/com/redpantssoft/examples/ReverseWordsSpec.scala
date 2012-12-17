package com.redpantssoft.examples

import org.junit.runner.RunWith
import org.scalatest.FunSpec
import org.scalatest.junit.JUnitRunner
import org.scalatest.matchers.ShouldMatchers

@RunWith(classOf[JUnitRunner])
class ReverseWordsSpec extends FunSpec with ShouldMatchers {

  describe("The function reverseWordsSpec") {
    it("should reverse the words in the sentence") {
      val str = "Do or do not, there is no try."
      val res = "try. no is there not, do or Do"
      reverseWords(str) should be(res)
    }
  }

}
