package com.redpantssoft.examples

import org.scalatest.path.FunSpec
import org.scalatest.matchers.ShouldMatchers
import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class IntStrConverterSpec extends FunSpec with ShouldMatchers {

  describe("char2Int") {
    it("should convert a character to an integer correctly") {
      char2Int('1') should be(1)
      char2Int('2') should be(2)
      char2Int('3') should be(3)
      char2Int('4') should be(4)
      char2Int('5') should be(5)
      char2Int('6') should be(6)
      char2Int('7') should be(7)
      char2Int('8') should be(8)
      char2Int('9') should be(9)
    }

  }

  describe("int2Char") {
    it("should convert an integer to a character correctly") {
      int2Char(1) should be('1')
      int2Char(2) should be('2')
      int2Char(3) should be('3')
      int2Char(4) should be('4')
      int2Char(5) should be('5')
      int2Char(6) should be('6')
      int2Char(7) should be('7')
      int2Char(8) should be('8')
      int2Char(9) should be('9')
    }

  }

  describe("str2Int") {
    it("should convert a string to an integer correctly") {
      str2Int("0") should be(0)
      str2Int("1") should be(1)
      str2Int("-1") should be(-1)
      str2Int("54") should be(54)
      str2Int("215") should be(215)
      str2Int("-569") should be(-569)
    }

  }

  describe("int2Str") {
    it("should convert an integer to a string correctly") {
      int2Str(0) should be("0")
      int2Str(1) should be("1")
      int2Str(-1) should be("-1")
      int2Str(54) should be("54")
      int2Str(215) should be("215")
      int2Str(-569) should be("-569")
    }

  }

}
