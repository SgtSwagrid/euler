package io.github.sgtswagrid.euler

import library.Root

/** https://projecteuler.net/problem=9 */
object Problem0009:

  @main
  def solution9(): Unit = println:
    (for
      a <- 1 to 1000
      b <- a to 1000 - a
      c <- Root.sqrtIfSquare(a * a + b * b)
      if a + b + c == 1000
    yield a * b * c)
    .head
