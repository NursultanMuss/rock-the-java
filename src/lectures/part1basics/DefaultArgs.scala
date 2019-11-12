package lectures.part1basics

object DefaultArgs extends App {

  def tailRecFactorial(n: Int,acc: Int= 1): Int = {
    if(n<=1) acc
    else tailRecFactorial(n-1, acc* n)
  }

  val fact10 = tailRecFactorial(10)

  def savePicture(format: String = "jpg", width: Int, height: Int): Unit = println("saving picture")

  savePicture( width = 800, height= 600)
}
