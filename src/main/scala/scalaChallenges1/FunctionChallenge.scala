package scalaChallenges1

object FunctionChallenge extends App {



  /*
      Exercises:
      1.  A greeting function (name, age) => "Hi, my name is $name and I am $age years old."
      2.  Factorial function 1 * 2 * 3 * .. * n
      3.  A Fibonacci function
          f(1) = 1
          f(2) = 1
          f(n) = f(n - 1) + f(n - 2)
      4.  Tests if a number is prime.
     */

  // 1

//  def greeting(name: String, age: Int): Unit = {
//    println(s"Hi, my name is $name and I am $age years old.")
//  }
//
//  greeting("Devin", 39)

//  def factorial(n: Int): Int = {
//    if(n == 1) n
//    else n * factorial(n-1)
//  }
//
//  println(factorial(5))

  def fibonacci(n: Int): Int =
    if (n <= 2) 1
    else fibonacci(n - 1) + fibonacci(n - 2)

  println(fibonacci(5))

  // auxiliary function

  def isPrime(n: Int): Boolean = {
    def isPrimeUntil(t: Int): Boolean =
      if (t <= 1) true
      else n % t != 0 && isPrimeUntil(t - 1)

    isPrimeUntil(n / 2)
  }

  println(isPrime(37))
  println(isPrime(2003))
  println(isPrime(37 * 17))

}
