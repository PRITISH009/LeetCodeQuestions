import scala.annotation.tailrec
import scala.math._

object DigitCount extends App {

  @tailrec
  def digitCount(number: Int, numDigits: Int = 0): Int = {
    if(number != 0) digitCount(number/10, numDigits + 1)
    else if(numDigits == 0) 1
    else numDigits
  }

  // Another Approach -
  // Not Only works for positive numbers and -1
  def digitCountOpt(number: Long): Int = {
    Math.log10(number).asInstanceOf[Int] + 1
  }

  println(digitCount(123)) // O(N)
  println(digitCountOpt(123)) // O(1)

  println(digitCount(1231231231))
  println(digitCountOpt(1231231231))

  println(digitCount(0))
  println(digitCountOpt(0)) // Does not work for 0 and negative integers

  println(digitCount(-1))
  println(digitCountOpt(-1))

  println(digitCount(-123123123))
  println(digitCountOpt(-123123123))

  println(digitCountOpt(1231231231231231231L))

}
