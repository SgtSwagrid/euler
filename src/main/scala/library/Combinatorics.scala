package io.github.sgtswagrid.euler
package library

object Combinatorics:

  def factorial(n: Int): BigInt =
    (1 to n).map(BigInt.apply).product

  def choose(n: Int, k: Int): BigInt =
    ((n - k + 1) to n).map(BigInt.apply).product / factorial(k)
