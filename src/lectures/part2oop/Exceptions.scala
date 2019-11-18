package lectures.part2oop

import javax.naming.spi.DirStateFactory.Result

object Exceptions extends App {


//  val array = Array.ofDim(Int.MaxValue)
  def add_by_one(x: Int):Int =x+add_by_one(x)
//  println(add_by_one(1))

  class OverflowException extends RuntimeException
  class UnderflowException extends RuntimeException
  class MathCalculationException extends RuntimeException("Division By Zero")

  class PocketCalculator(){
    def add(x:Int, y:Int) ={
      val result =  x + y
      if(x >0 && y> 0 && result<0) throw new OverflowException
      else if (x<0 && y<0 && result>0) throw new UnderflowException
      else result
    }
    def multiyply(x:Int, y:Int) ={var result = x * y
    if(x>0 && y>0 && result<0)throw new OverflowException
    else if(x<0 && y<0 && result<0)throw new OverflowException
      else if(x>0 && y<0 && result>0)throw new UnderflowException
      else if(x<0 && y>0 && result>0)throw new UnderflowException
      else result
    }
    def devide(x:Int, y:Int) = if(y == 0) throw new MathCalculationException
    else x /y
    def subtract(x:Int, y:Int) = {
      val result = x- y
      if(x>0 && y<0 && result<0)  throw new OverflowException
      else if(x<0 && y>0 && result>0) throw new UnderflowException
      else result
    }
  }

  val calculator = new PocketCalculator
//    println(calculator.add(4,Int.MaxValue))
//  println(calculator.subtract())
  println(Int.MinValue)
  println(calculator.devide(4,0))
}
