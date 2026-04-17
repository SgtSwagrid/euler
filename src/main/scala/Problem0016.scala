package io.github.sgtswagrid.euler

import library.Digits

/** https://projecteuler.net/problem=16 */
object Problem0016:

  @main
  def solution16(): Unit = println:
    Digits.digits(BigInt(2).pow(1000), 10).sum
