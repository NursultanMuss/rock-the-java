package lectures

object Functions extends App {

  def greetingFunc (name: String, age: Int): Unit =
    println(s"hi my name is $name, and i am $age years old!!!");
  greetingFunc("Nursultan", 27)
  def factorialFunc (n: Int):Int = {
      if (n >= 0) n* factorialFunc(n-1)  else 1
  }
  println(factorialFunc(5))

  def fibonacciFunc(n: Int):Int={
   if(n <= 2) 1 else fibonacciFunc(n-1) + fibonacciFunc(n-2)
  }
  println(fibonacciFunc(6))// 1 1 2 3 5 8 13 21
  //6   (5)+(4)
  //5   (4)+(3)   4   (3)+(2)
  //4   (3)+(2)   3   (2)+(1)
//  def isPrime(n: Int):Boolean ={
//    def isPrimeUntil (t:Int) :Boolean =
//      if(t <= 1) true else
//  }


}


