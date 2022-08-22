package lectures

object SortingandTailrec extends App {

  //  def sortList(list: List[Int]): List[Int] = {
  //    // insertion sort
  //
  //    def insert(number: Int, sortedList: List[Int]): List[Int] =
  //      if(sortedList.isEmpty || number <= sortedList.head) number :: sortedList
  //      else sortedList.head :: insert(number, sortedList.tail)
  //
  //    if (list.isEmpty || list.tail.isEmpty) list
  //    else insert(list.head, sortList(list.tail))
  //  }
  //
  //  //  TAIL RECURSION
  //  @tailrec
  //  def sortBetter(list: List[Int]): List[Int] = {
  //    def insertTailrec(number: Int, sortedList: List[Int], accumulator: List[Int]): List[Int] =
  //      if(sortedList.isEmpty || number <= sortedList.head) accumulator.reverse ++ (number :: sortedList)
  //      else insertTailrec(number, sortedList.tail, sortedList.head :: accumulator)
  //
  //    def sortTailrec(list: List[Int], accumulator: List[Int]): List[Int] =
  //     if (list.isEmpty) accumulator
  //     else sortTailrec(list.tail, insertTailrec(list.head, accumulator, Nil))
  //
  //    sortTailrec(list, Nil)
  //  }

}
