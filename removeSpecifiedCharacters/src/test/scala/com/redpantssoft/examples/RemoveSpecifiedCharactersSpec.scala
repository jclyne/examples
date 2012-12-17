package com.redpantssoft.examples

import org.junit.runner.RunWith
import org.scalatest.FunSpec
import org.scalatest.junit.JUnitRunner
import org.scalatest.matchers.ShouldMatchers

@RunWith(classOf[JUnitRunner])
class RemoveSpecifiedCharactersSpec extends FunSpec with ShouldMatchers {
  describe("The removeSpecifiedCharacters function") {
    it("should remove any character in the string 'remove' from the string 'str'") {
      val str = "Battle of the Vowels: Hawaii vs. Grozny"
      val remove = "aeiou"
      val res = "Bttl f th Vwls: Hw vs. Grzny"

      removeSpecifiedCharacters(str, remove) should be(res)
    }
  }
}
