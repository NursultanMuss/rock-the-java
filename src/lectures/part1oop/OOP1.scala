package lectures.part1oop

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
  def + (person: Person)=new Person(person.name+" the rockstar", favoriteMovie)

}
class Person1 (val name: String, favoriteMovie:String, val age:Int){
  def + (person: Person)=new Person(person.name+" the rockstar", favoriteMovie)

}
