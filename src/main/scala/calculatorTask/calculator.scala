package calculatorTask

object calculator {

    def main(args: Array[String]) {
      var ch: Int = 0
      var num1: Int = 0
      var num2: Int = 0
      var result: Double = 0

      print("Choose operation to perform " +
        "\n1.addition\n" +
        "2.substraction\n" +
        "3.multiplication\n" +
        "4.devision\n" +
        "5.modulus\n" +
        "6.power\n" +
        "7.absolute number\n" +
        "8.maximum of two\n" +
        "9.minimum of two\n" )
      ch = scala.io.StdIn.readInt()

      print("Enter first number: ")
      num1 = scala.io.StdIn.readInt()

      print("Enter second number: ")
      num2 = scala.io.StdIn.readInt()

      ch match {
        case 1 => result = num1 + num2
        case 2 => result = num1 - num2
        case 3 => result = num1 * num2
        case 4 => result = num1 / num2
        case 5 => result = num1 % num2
        case 6 => result = scala.math.pow(num1, num2)
        case 7 =>
          println("enter the number whose absolute to be calculated")
          val absoluteNo = scala.io.StdIn.readInt()
          result = (absoluteNo).abs
        case 8 => result = scala.math.max(num1, num2)
        case 9 => result = scala.math.min(num1, num2)
        case 10 =>
      }
      println("Result: " + result)
    }

}
