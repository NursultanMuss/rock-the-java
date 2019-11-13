package lectures.part1oop

object OOP1 extends App {

}

class Writer(firstName: String, surName: String,val year: Int){
 def fullName () = {
   println(s"$firstName $surName")
 }
}

class Novel (name: String, yearOfRelease: Int, author: Writer){
   def authorAge(): Unit ={
     println(yearOfRelease - author.year)
   }

  def isWrittenBy(): Unit ={
    println (s"This novel $name is written by ${author.fullName()} ")
  }

  def copy(newYearOfRelease :Int) ={
    new Novel(name,newYearOfRelease,author)
  }

}


class Counter(value: Int){
  def currentCount(): Int ={
    value
  }

  def increment():Counter={
    new Counter(value+1)
  }
  def decrement():Counter={
    new Counter(value-1)
  }

  def increment(amount:Int):Counter={
    new Counter(value+1)
  }

  def decrement(amount:Int):Counter={
    new Counter(value-1)
  }
}
