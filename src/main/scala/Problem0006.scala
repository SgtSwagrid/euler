package io.github.sgtswagrid.euler

import library.Triangle

/** https://projecteuler.net/problem=6 */
object Problem0006:

  @main
  def solution6(): Unit = println:
    (Triangle.to(100) * Triangle.to(100)) - (1 to 100).map(n => n * n).sum
