package lectures.oop

object AbstractDataTypes extends App {

  // abstract

  abstract class Animal {
    val creatureType: String
    def eat: Unit
  }

  class Dog extends Animal {
    override val creatureType: String = "Canine"
    override def eat: Unit = println("crunch crunch")

  }

  // traits
  trait Carnivore {
    def eat(animal: Animal): Unit
    val preferredMeal: String = "fresh meat"
  }

  trait Coldblooded

  class Crocodile extends Animal with Carnivore with Coldblooded {
    val creatureType: String = "Croc"
    def eat: Unit = "nomnomnom"
    def eat(animal: Animal): Unit = s"I'm a croc and I'm eating ${animal.creatureType}"
  }

  val dog = new Dog
  val croc = new Crocodile
  croc.eat(dog)

  // traits vs abstract classes
  // 1 - traits do not have constructor parameters *** SCALA 3 DOES ***
  // 2 - multiple traits may be inherited by the same class
  // 3 - traits = behavior, abstract class = "thing"

}
