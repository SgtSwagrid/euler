package io.github.sgtswagrid.euler
package library

object Root:

  def sqrtIfSquare(n: Long): Option[Int] =
    val sqrt = Math.sqrt(n).toInt
    Option.when(sqrt.toLong * sqrt == n)(sqrt)
