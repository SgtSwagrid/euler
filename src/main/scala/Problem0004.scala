package io.github.sgtswagrid.euler

import library.Digits

/** https://projecteuler.net/problem=4 */
object Problem0004:

  @main
  def solution4(): Unit = println:
    (for
      a <- 100 to 999
      b <- a to 999
      ab = a * b
      if Digits.isPalindrome(ab)
    yield ab)
    .max
