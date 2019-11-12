package lectures

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
    def isPrimeUntil(t: Int):Boolean =
      if(t <= 1) true
    else n % t !=0 && isPrimeUntil(t-1)

    isPrimeUntil(n/2)
  }

  def fibonacciRec(n: Int): Int ={
    @tailrec
    def fibonacciHelper1(x:Int, accumulator1: Int): Int=
      if(x<=n)fibonacciHelper1(accumulator1,x+accumulator1)
        else accumulator1
    fibonacciHelper1(0,1)
  }

  println(fibonacciRec(6))
  println(fibonacciRec(7))
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
