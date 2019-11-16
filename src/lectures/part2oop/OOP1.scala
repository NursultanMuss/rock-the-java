package lectures.part2oop
import scala.language.postfixOps

object OOP1 extends App {

  val author = new Writer("Ernest", "Hemingway",1899)
  val poster = new Writer("Ernest", "Hemingway",1899)
  println(author.fullName())
  val novel = new Novel("The Old Man and the Sea", 1952, author)
  novel.authorAge()
  println(novel.isWrittenBy(poster))

  val counter = new Counter
  counter.increment.print
  counter.increment(20).print

  val person = new Person("Mary","я и ты");
  println((person + "the Rock Star").name)

  val mary = new Person1("Mary", "Pirates",21)
  println((+mary).age)

  println(mary learnScala)

  println(mary(2))


}

class Writer(firstName: String, surName: String,val year: Int) {
  def fullName() =
    s"$firstName $surName"
}

class Novel (name: String, yearOfRelease: Int, author: Writer){
   def authorAge(): Unit ={
     println(yearOfRelease - author.year)
   }

  def isWrittenBy(author:Writer) = author == this.author;

  def copy(newYearOfRelease :Int) ={
    new Novel(name,newYearOfRelease,author)
  }

}


class Counter(val value: Int = 0){
  def increment()= new Counter(value+1)
  def decrement():Counter={
    new Counter(value-1)
  }

  def increment(amount:Int):Counter={
    if(amount<=0) this
    else increment.increment(amount - 1)
  }

  def decrement(amount:Int):Counter={
    if(amount <= 0) this
    else decrement().decrement(amount - 1)
  }

  def print = println(value)
}

class Person (val name: String, favoriteMovie:String){
  def + (nickName: String)=new Person(s"$name ($nickName)" , favoriteMovie)

}
class Person1 (val name: String, favoriteMovie:String, val age:Int =0, val learn:String = ""){
  def + (person: Person)=new Person1(person.name+" the rockstar", favoriteMovie, age+1)
  def unary_+ : Person1 = new Person1(name, favoriteMovie, age + 1)
  def learns (whtLearned:String)= s"$name learns $whtLearned"
  def learnScala = learns("Scala")

  def apply(number: Int) = s"$name watched favorite movie $number times"
}
