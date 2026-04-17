package io.github.sgtswagrid.euler

/** https://projecteuler.net/problem=1 */
object Problem0001:

  @main
  def solution1(): Unit = println:
    (1 until 1000).filter(n => n % 3 == 0 || n % 5 == 0).sum
