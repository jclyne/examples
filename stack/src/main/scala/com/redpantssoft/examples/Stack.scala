package com.redpantssoft.examples

import annotation.tailrec


class Stack[T](head: Option[Stack.Node[T]]) {

  import Stack._

  def push(elem: T): Stack[T] = {
    new Stack[T](Some(new Node[T](head, elem)))
  }

  def pop: (Option[T], Stack[T]) = head match {
    case None =>
      (None, this)
    case Some(Node(next, data)) =>
      (Some(data), new Stack[T](next))
  }

  def empty = !head.isDefined

  def length = {
    @tailrec
    def countElements(cur: Option[Node[T]], cnt: Int): Int = cur match {
      case Some(Node(next, _)) => countElements(next, cnt + 1)
      case None => cnt
    }
    countElements(head, 0)
  }
}

object Stack {

  case class Node[T](next: Option[Node[T]], data: T)

  def apply[T] = new Stack[T](None)
}
