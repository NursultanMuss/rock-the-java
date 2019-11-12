package lectures.part1basics

import scala.annotation.tailrec

object Recursion extends App {

  def concatinationNTimes(string: String, n:Int):String={
    @tailrec
  def concatinationHelper(x: Int, stringRec: String, summary:String): String=
    if(x == 0) summary
    else concatinationHelper(x-1,stringRec,stringRec +summary)

    concatinationHelper(n, string," ")
  }
  println(concatinationNTimes("Nurs",5))
  println(37 % 18)

  def isPrimeTailRecursive(n: Int):Boolean = {
    def isPrimeUntil(t: Int, isStillPrime:Boolean):Boolean =
      if(!isStillPrime) false
    else if(t <= 1) true
    else  isPrimeUntil(t-1,n % t !=0 && isStillPrime)

    isPrimeUntil(n/2, true)
  }
  println(isPrimeTailRecursive(2003))

  def fibonacciRec(n: Int): Int ={
    @tailrec
    def fibonacciHelper1(x:Int, last: Int, nextToLast: Int): Int=
      if(x<=n)fibonacciHelper1(x+1, last+nextToLast, last)
        else last
    if( n <= 2)1

    fibonacciHelper1(2,1,1)
  }

  println(fibonacciRec(1))
  println(fibonacciRec(2))
  println(fibonacciRec(3))
  println(fibonacciRec(4))
  println(fibonacciRec(5))
  println(fibonacciRec(6))
  println(fibonacciRec(7))
  println(fibonacciRec(8))
  println(fibonacciRec(9))
  println(fibonacciRec(10))
  // 1 1 2 3 5 8 13 21
  /*
  4
  0 1 a=1
  1 1 a=1
  1 2 a=2
  2 3 a=3
  3 5 a=5
  5 8 a=8
  8 13 a=13


   */

}
