package io.github.sgtswagrid.euler

import library.Collatz

/** https://projecteuler.net/problem=14 */
object Problem0014:

  @main
  def solution14(): Unit = println:
    (1 until 999999).maxBy(Collatz.length)
