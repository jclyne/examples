package com.redpantssoft.examples

import org.scalatest.path.FunSpec
import org.scalatest.matchers.ShouldMatchers
import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner
import util.Random

@RunWith(classOf[JUnitRunner])
class recursiveBinarySearchSpec extends FunSpec with ShouldMatchers {

  val rand = Random

  def fillIntArray(arr: Array[Int], pos: Int = 0): Array[Int] = {
    if (pos < arr.length) {
      arr(pos) = rand.nextInt()
      fillIntArray(arr, pos + 1)
    }
    else
      arr
  }

  val arr10 = fillIntArray(new Array[Int](10)).sorted

  describe("The function recursiveBinarySearch") {
    it("should find the correct index for a key at pos 3 in an array of length 10") {
      val index = 3
      val key = arr10(index)
      recursiveBinarySearch(arr10, key) should be(index)
    }

  }
}
