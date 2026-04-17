package io.github.sgtswagrid.euler

import library.Fibonacci

/** https://projecteuler.net/problem=2 */
object Problem0002:

  @main
  def solution2(): Unit = println:
    Fibonacci.ints.takeWhile(_ <= 4000000).filter(_ % 2 == 0).sum
