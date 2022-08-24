package lectures.oop

object AnonymousClasses extends App {

  abstract class Animal {
    def eat: Unit
  }

  // anonymous class

  val funnyAnimal: Animal = new Animal {
    override def eat: Unit = println("hahahahahahahaha")
  }


//  class AnonymousClasses$$anon$1 extends Animal {
//    override def eat: Unit = println("hahahahahahahaha")
//  }





  println(funnyAnimal.getClass)

  class Person(name: String) {
    def sayHi: Unit = println(s"Hi, my name is $name, how can I help")
  }

}
