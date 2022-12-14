package scalaChallenges2

/*
        Write a method called isPalindrome with one int parameter called number.
        The method needs to return a boolean.
        It should return true if the number is a palindrome number otherwise it should return false.
        Example input/output:
        *   isPalindrome(-1221); -> should return true
        *   isPalindrome(707); -> should return true
        *   isPalindrome(11212); -> should return false because reverse is 21211 and that is not equal to 11212.
        Find the reverse of the given number. Store in some variable say reverse.
        Compare the number with reverse.
        If both are the same then the number is a palindrome otherwise it is not.
        Declare and initialize another variable to store the reverse of a number, for example reverse = 0.
        Store the last digit to some variable say lastDigit = num % 10.
        Increase the place value of reverse by one.
        To increase place value multiply the reverse variable by 10 e.g. reverse = reverse * 10.
        Add lastDigit to reverse.
        Since the last digit of the number is processed, remove the last digit of num.
        To remove the last digit divide number by 10.
        Repeat steps until number is not equal to (or greater than) zero.
        A while loop would be a good for this coding exercise.
        */

object NumberPalindrome extends App {

//  println(isPalindrome(-1221))
//  println(isPalindrome(707))
//  println(isPalindrome(11212))

}
