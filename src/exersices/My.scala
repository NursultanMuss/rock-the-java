package exersices

abstract class My {

  /*
  head = first element of the list
  */
  def head():Int

  //tail = last element of the list
  def tail():My

  def isEmpty():Boolean

  def add(int: Int):My

  def printElements: String
  override def toString: String = "[" +printElements + "]"


}

object Empty extends My{
  override def head(): Int = throw new NoSuchElementException

  override def tail(): My = throw new NoSuchElementException

  override def isEmpty(): Boolean = true

  override def add(int: Int): My = new Exercise_3(int, Empty)

  override def printElements: String = ""
}



class Exercise_3(h: Int, t: My) extends My {
  override def head(): Int = h

  override def tail(): My = t

  override def isEmpty(): Boolean = false

  override def add(value: Int): My = new Exercise_3(value, this)

  override def printElements: String =
    if (t.isEmpty()) ""+ h
  else h + " " + t.printElements
}


object ListTest extends App{
  val list = new Exercise_3(1, new Exercise_3(2, new Exercise_3(3, Empty)))
  println(list.head())
  println(list.add(4).head)
  println(list.isEmpty)
//
  println(list.toString)
}