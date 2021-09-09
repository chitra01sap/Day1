package stringOperations

object stringTest {

  def main(args:Array[String]) {
    //Create a Scala program to reverse, and then format to upper case
    val strToFormat = "http://"
    val reversedAndToUpperCase = strToFormat.reverse.toUpperCase()
    println(s"$strToFormat reversed and then to upper case = $reversedAndToUpperCase")

    //Create a Scala program to output the following basic JSON notation.(multiline string)
    //Output:
    //{
    //"donut_name":"Vanilla Donut",
    //"quantity_purchased":"10",
    //"price":2.5
    //}
    val Name = "chitra"
    val empNO= 1664
    val salary = 50000
    val donutJson =
      s"""
         |{
         |"donut_name":"$Name",
         |"quantity_purchased":"$empNO",
         |"price":$salary
         |}
      """.stripMargin
    println(donutJson)
  }
}
