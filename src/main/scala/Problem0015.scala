package io.github.sgtswagrid.euler

import library.Combinatorics

/** https://projecteuler.net/problem=15 */
object Problem0015:

  @main
  def solution15(): Unit = println:
    Combinatorics.choose(40, 20)
