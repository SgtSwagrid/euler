package io.github.sgtswagrid.euler
package library

case class Pos(x: Int, y: Int):

  infix def + (that: Pos): Pos = Pos(x + that.x, y + that.y)
  infix def - (that: Pos): Pos = this + -that
  infix def * (that: Int): Pos = Pos(x * that, y * that)
  def unary_- : Pos = Pos(-x, -y)
  def abs: Pos = Pos(x.abs, y.abs)
  def above(minX: Int, minY: Int): Pos = Pos(Math.max(x, minX), Math.max(y, minY))
  def below(maxX: Int, maxY: Int): Pos = Pos(Math.min(x, maxX), Math.min(y, maxY))

object Pos:

  def zero: Pos = Pos(0, 0)

  def left: Pos = Pos(-1, 0)
  def right: Pos = Pos(1, 0)
  def up: Pos = Pos(0, 1)
  def down: Pos = Pos(0, -1)

  def orthogonal: Seq[Pos] = Seq(left, right, up, down)
  def diagonal: Seq[Pos] = Seq(Pos(1, 1), Pos(-1, -1), Pos(-1, 1), Pos(1, -1))
  def octagonal: Seq[Pos] = orthogonal ++ diagonal
