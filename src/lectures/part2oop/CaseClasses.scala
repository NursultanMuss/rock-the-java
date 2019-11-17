package lectures.part2oop

object CaseClasses extends App {

  //equals, hashCode, toString
  case class Person(name:String, age: Int)

  //1.class parameters are fields
  val jim = new Person("Jim", 34)
  println(jim.name)
  //2. sensible toString
  println(jim.toString)
  //println(instance) = println(instance.toString) //syntactic sugar
  println(jim)

  //3. equals and hashCode implemented ( сразу)
  val jim2= new Person("Jim", 34)
  println( jim == jim2)

  //4.case classes have handy copy methods
  val jim3= jim.copy(age=45)
  println(jim3)

  //5. Case Class have companion object
  val thePerson = Person
  val mary = Person("Mary", 23)
  // создается экземпляр класса без слова new

  //6. CCs are serializable (можно отправлять экземпляр класса через сеть
  // и в JVN. И особенно важно когда работаешь в Акка фреймворке
  //Akka send messages throw the network, and our messages is CASE CLASSES

  //7. CCs have extractor patterns = CCs can be used in PATTERN MATHCING

  case object UnitedKingdom {
    def name: String = "The UK of GB and NI"
  }
  /*
  Expand MyList - use case classes and case objects
   */



}
