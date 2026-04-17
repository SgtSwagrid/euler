package io.github.sgtswagrid.euler
package library

object Fibonacci:

  lazy val ints: LazyList[Int] = 0 #:: 1 #:: ints.zip(ints.tail).map(_ + _)

  lazy val longs: LazyList[Long] = 0L #:: 1L #:: longs.zip(longs.tail).map(_ + _)

  lazy val bigints: LazyList[BigInt] = BigInt(0) #:: BigInt(1) #:: bigints.zip(bigints.tail).map(_ + _)
