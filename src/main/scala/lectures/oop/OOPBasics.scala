package lectures.oop

object OOPBasics extends App {

  val person = new Person("John", 38)


//  println(person.x)
//  person.greet("Daniel")
//  person.greet()

  val author = new Writer("Charles", "Dickens", 1812)
  val novel = new Novel("Great Expectations", 1861, author)

  println(novel.authorAge)
  println(novel.isWrittenBy(author))

  val counter = new Counter
  counter.inc.print

}

// constructor
class Person(name: String, age: Int) {
  // body

  val x = 2

  println(1 + 3)

  // method
  def greet(name: String): Unit = println(s"${this.name} says Hi, $name")

  // overloading
  def greet(): Unit = println(s"Hi,I am $name")

  // multiple constructors
  def this(name: String) = this(name, 0)
  def this() = this("John Doe")

}

// class parameters are NOT FIELDS

class Writer(name: String, surname: String, val year: Int) {

  def fullname(): Unit = println(s"${this.name} ${this.surname}")
}

class Novel(name: String, year: Int, author: Writer) {

  def authorAge = year - author.year
  def isWrittenBy(author: Writer) = author == this.author
  def copy(newYear: Int): Novel = new Novel(name, newYear, author)

}

class Counter(val count: Int = 0) {
  def inc = {
    println("incrementing")
    new Counter(count + 1)
  } // immutability

  def dec = {
    println("decrementing")
    new Counter(count - 1)
  }

  def inc(n: Int): Counter = {
    if (n <= 0) this
    else inc.inc(n-1)
  }

  def dec(n: Int): Counter = {
    if (n <= 0) this
    else dec.dec(n - 1)
  }

  def print = println(count)

}