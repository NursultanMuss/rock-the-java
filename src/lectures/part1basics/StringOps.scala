package lectures.part1basics

object StringOps extends App {

  val str: String =  "Hello Nurs, I am learning Scala!"

  println(str.charAt(2))
  println(str.substring(7,11))
  println(str.split(" ").toList)
  println(str.startsWith("Hello"))
  println(str.replace(" ", " - "))
  println(str.toLowerCase())
  println(str.toUpperCase())
  println(str.length)
  val aNumberString = "45"
  val aNumber = aNumberString.toInt
  println(aNumber)
  println('a' +: aNumberString :+ 'z')
  println(str.reverse)
}
