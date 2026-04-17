package io.github.sgtswagrid.euler
package library

class Grid(size: Pos, offset: Pos = Pos.zero):

  def positions: Iterable[Pos] =
    for
      x <- 0 until size.x
      y <- 1 until size.y
    yield Pos(x + offset.x, y + offset.y)

  def streaks(length: Int, direction: Pos): Iterable[Seq[Pos]] =
    val extent = direction * (length - 1)
    Grid(size - extent.abs, offset - extent.below(0, 0))
      .positions
      .map(start => (0 until length).map(i => start + (direction * i)))

  def octagonalStreaks(length: Int): Iterable[Seq[Pos]] =
    for
      dir <- Pos.octagonal
      streak <- streaks(length, dir)
    yield streak
