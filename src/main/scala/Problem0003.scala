package io.github.sgtswagrid.euler

import library.Factor

/** https://projecteuler.net/problem=3 */
object Problem0003:

  @main
  def solution3(): Unit = println:
    Factor.primeFactors(600851475143L).max
