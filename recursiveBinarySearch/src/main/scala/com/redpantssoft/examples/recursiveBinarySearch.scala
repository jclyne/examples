package com.redpantssoft.examples

object recursiveBinarySearch {

  def apply[T <% Ordered[T]](arr: Array[T], key: T): Int = {

    def search(in: Array[T], lower: Int, upper: Int): Int = {
      if (lower <= upper) {
        val pivot = ((upper - lower) / 2) + lower
        val pivotVal = in(pivot)
        if (key == pivotVal)
          pivot
        else if (key < pivotVal)
          search(in, lower, pivot - 1)
        else
          search(in, pivot + 1, upper)
      } else
        -1
    }
    search(arr, 0, arr.length - 1)
  }
}
