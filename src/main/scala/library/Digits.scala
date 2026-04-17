package io.github.sgtswagrid.euler
package library

object Digits:

  def digits(n: Long, b: Int = 10): Seq[Int] =
    if n < b then Seq(n.toInt) else digits(n / b, b) :+ (n % b).toInt

  def digits(n: BigInt, b: Int): Seq[Int] =
    if n < b then Seq(n.toInt) else digits(n / b, b) :+ (n % b).toInt

  def withDigits(n: Int, b: Int = 10): Iterator[Int] =
    val start = Math.pow(b, n - 1).toInt
    val end = Math.pow(b, n).toInt
    Iterator.from(start).takeWhile(_ < end)

  def isPalindrome(seq: Seq[Any]): Boolean =
    seq.zip(seq.reverse).forall(_ == _)

  def isPalindrome(n: Long, b: Int = 10): Boolean =
    isPalindrome(digits(n, b))
