package scalaChallenges1

import scala.math._


/*
        Write a method named area with one double parameter named radios.
        The method need to return a double value that represents the area of a circle.
        If the parameter radius is negative then return -1.0 to represent an invalid value.
        Write another overloaded method with 2 parameters x and y (both doubles),
        where x and y represent the sides of a rectangle.
        The method need to return an area of an rectangle.
        If either or both parameters is/are a negative return -1.0 to indicate an invalid value.
        For formulas and PI value please check the tips below.
        Examples of input/output:
        *   area(5.0); should return 78.53975
        *   area(-1); should return -1 since the parameter is negative
        *   area(5.0, 4.0); should return 20.0 (5 * 4 = 20)
        *   area(-1.0, 4.0); should return -1 since the first parameter is negative.
        */


object AreaCalculator extends App{

  def area(radius: Double): Double = {
    if(radius < 0) -1.0
    else Pi * (radius * radius)
  }

  def area(x:Double, y: Double): Double = {
    if(x < 0 || y < 0) -1
    else x * y

  }

  println(area(5.0))
  println(area(-1))
  println(area(5.0, 4.0))
  println(area(-1.0, 4.0))

}
