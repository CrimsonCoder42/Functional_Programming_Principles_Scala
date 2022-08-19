object NNNNU extends App {

  // nothingness differences

  // 1 - the null reference - used to represent an absent value.

  val anAbsentString: String = null
  anAbsentString.length

  // 2 - Null
  class Person
  val theNullReference: Null = null
  val noString: String = theNullReference
  val noPerson: Person = theNullReference
  val noList: List[Int] = theNullReference
  // AnyRef -> all reference types -> Null
  // Null has special treatment by the compiler

  // 3 - Nil
  val anEmptyList: List[Int] = Nil
  println(Nil.length)

  // Unit: Equal to Void in other languages

  def aUnitReturningMethod(): Unit = println("I'm starting to get the difference")
  val theUnit: Unit = ()

  // 6 - Nothing = no value at all
  val nothingInt: Int = throw new RuntimeException("no int") // returns Nothing
  val nothingString: String = throw new RuntimeException("No string") // returns Nothing


}
