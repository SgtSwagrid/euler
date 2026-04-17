package io.github.sgtswagrid.euler

import library.{Factor, Triangle}

/** https://projecteuler.net/problem=12 */
object Problem0012:

  @main
  def solution12(): Unit = println:
      Triangle.generate.find(n => Factor.factors(n).sizeIs > 500).get
