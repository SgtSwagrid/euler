package io.github.sgtswagrid.euler

import library.Factor

/** https://projecteuler.net/problem=10 */
object Problem0010:

  @main
  def solution10(): Unit = println:
    Factor.primes.takeWhile(_ < 2000000).map(_.toLong).sum
