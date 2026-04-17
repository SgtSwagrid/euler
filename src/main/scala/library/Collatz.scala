package io.github.sgtswagrid.euler
package library

import scala.annotation.tailrec

object Collatz:

  def length(n: Int): Int = length(n.toLong)

  @tailrec
  def length(n: Long, total: Int = 0): Int = n match
    case 1L => total + 1
    case n if n % 2 == 0 => length(n / 2, total + 1)
    case n => length(3 * n + 1, total + 1)
