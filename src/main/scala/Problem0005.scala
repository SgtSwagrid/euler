package io.github.sgtswagrid.euler

/** https://projecteuler.net/problem=5 */
object Problem0005:

  @main
  def solution5(): Unit = println:
    Iterator.from(1).find(n => (2 to 20).forall(n % _ == 0)).get
