package io.github.sgtswagrid.euler
package library

object Factor:

  def isPrime(n: Long): Boolean =
    n > 1 && (2 to Math.sqrt(n).toInt).forall(n % _ != 0)

  lazy val naturals: LazyList[Int] = LazyList.from(1)

  lazy val primes: LazyList[Int] = LazyList.from(2).filter(isPrime)

  def factors(n: Long): LazyList[Long] =
    val sqrt = Math.sqrt(n)
    val factors = naturals.takeWhile(_ <= sqrt).filter(n % _ == 0).map(_.toLong)
    factors ++ factors.reverse.dropWhile(m => m * m == n).map(n / _)

  def primeFactors(n: Long): LazyList[Long] =
    val sqrt = Math.sqrt(n)
    val factors = primes.takeWhile(_ <= sqrt).filter(n % _ == 0).map(_.toLong)
    factors ++ factors.reverse.dropWhile(m => m * m == n).map(n / _).filter(isPrime)
