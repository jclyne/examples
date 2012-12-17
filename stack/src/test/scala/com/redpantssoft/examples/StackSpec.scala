package com.redpantssoft.examples

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner
import org.scalatest.matchers.ShouldMatchers
import org.scalatest.path.FunSpec

@RunWith(classOf[JUnitRunner])
class StackSpec extends FunSpec with ShouldMatchers {

  val emptyStack = Stack[Int]

  describe("Stack") {
    it("should correctly indicate that it is empty") {
      Stack[Int] should be('empty)
    }

    it("should correctly indicate that it is NOT empty") {
      emptyStack.push(5) should not be ('empty)
    }

    it("should correctly indicate its count after a push") {
      emptyStack.length should equal(0)
      emptyStack.push(5).length should equal(1)
      emptyStack.push(5).push(23).length should equal(2)
      emptyStack.push(5).push(23).push(67).length should equal(3)
    }

    it("should correctly indicate its count after a pop") {
      val threeStack = emptyStack.push(5).push(23).push(67)
      threeStack.length should equal(3)
      threeStack.pop match {
        case (_, twoStack) =>
          twoStack.length should equal(2)
          twoStack.pop match {
            case (_, oneStack) =>
              oneStack.length should equal(1)
              oneStack.pop match {
                case (_, zeroStack) =>
                  emptyStack.length should equal(0)
              }
          }
      }
    }

    it("should pop items in LIFO order") {
      val items = Array(1, 32, 939, 87, 452, 8)
      var testStack = emptyStack
      items.foreach(item => testStack = testStack.push(item))

      items.reverse.foreach {
        item =>
          testStack.pop match {
            case (data, newStack) =>
              testStack = newStack
              data should be('isDefined)
              data.get should equal(item)
          }
      }
    }
  }
}
