object Basics extends App {

  // defining a value

  val meaningOfLife: Int = 42; // const int meaning of life.

  val aBoolean = false // most of the time declaring is optional


  // strings and string operations
  val aString = "I love Scala"
  val aComposedString = "I" + " " + "Love" + " " + "Scala"
  val anInterpolatedString = s"The meaning of life is $meaningOfLife"

  // expressions  *** EVERYTHING IN SCALA IS AN EXPRESSION ***

  val anExpression = 2 + 3

  // if-expression
  val ifExpression = if (meaningOfLife > 43) 56 else 999 // in other languages: meaningOfLife > 43 ? 56: 999
  val chainedIfExpression =
    if(meaningOfLife > 43) 56
    else if (meaningOfLife < 0) -2
    else if (meaningOfLife > 999) 78
    else 0


  // code blocks
  val aCodeBlock = {
    // definitions
    val aLocalValue = 67

    // value of the block is the value of the last expression
    aLocalValue + 3
  }



    //define a function *** A CODE BLOCK IS ALSO AN EXPRESSION ***

    def myFunction(x: Int, y: String): String = {
      y + " " + x
    }

    // recursive functions

    def factorial(n: Int): Int =
      if (n <= 1) 1
      else n * factorial(n - 1)

    println(factorial(5))


}
