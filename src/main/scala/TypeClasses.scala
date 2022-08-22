object TypeClasses extends App{

  // problem
  // specialized implementations

  def processMyList[T](list: List[T]): T = {
    // "sum up" all the elements of the list
    // for integers => sum = actual sum of the elements
    // for strings => sum = CONCATENATION of all the elements

    // for other types => ERROR
    ???

  }
//
//  trait Summable[T] {
//    def sumElements(list: List[T]): T
//  }
//
//  implicit object IntSummable extends Summable[Int] {
//    override def sumElements(list: List[Int]) = list.sum
//  }
//
//  implicit object StringSummbale extends Summable[String] {
//    override def sumElements(list: List[String]) = list.mkString("")
//  }
//
//  def processMyList[T(List: List[T])]
}
