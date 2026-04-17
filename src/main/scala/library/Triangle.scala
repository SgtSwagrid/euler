package io.github.sgtswagrid.euler
package library

object Triangle:

  def generate: LazyList[Int] = LazyList.from(1).map(to)

  def to(end: Int): Int =
    end * (end + 1) / 2

  def between(start: Int, end: Int): Int = to(end) - to(start - 1)
