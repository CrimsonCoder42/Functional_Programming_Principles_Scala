object Loops extends App {

  // Java

  val x = 3 // constant

  var y = 5
  y = 999

  while (y < 9999) {
    //println("Hey ma, I'm looping")
    y += 1
  }

  // don't use loops in any way

  // functional thinking = EXPRESSIONS
  (999 to 9999).foreach(_ => println("Hey ma I'm doing a loop"))

  // transform a list

  List(1,2,3).map(x => x + 1) // List(2,3,4)
  List(1,2,3).flatMap(n => Seq.fill(n)(1)) // List(1, 1,1, 1,1,1, 1,1,1,1)
  List(1,2,3).filter(n=> n % 42 == 0)
  // fold, find, count, maxBy, sum, reduce

  // newb= "how can I loop through this list?"
  // mature = " How can I TRANSFORM this into what I want?"

  List(1,2,3).foreach { x => // lambda = function = function object
    println(x)
  }

  // for comprehensions

  for {
    x <- List(1,2,3)
    y <- List(1,2,3)
  } yield (x,y)

  // equivalent code = for comprehension complies to THIS
  List(1,2,3).flatMap(x => List(4,5,6).map(y => (x,y)))

}
