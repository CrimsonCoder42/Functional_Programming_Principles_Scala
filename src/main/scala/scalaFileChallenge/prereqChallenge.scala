package scalaFileChallenge

import scala.io.Source

object prereqChallenge extends App {

//  Problem
//  1
//  Write a program to read the csv file and
//  return a list of data records
//  , where each record corresponds to a row of values in the CSV file.You can use any data structure to represent a data record.

  println("customer_id, trans_date, tran_amount")
  val bufferedSource = Source.fromFile("src/main/resources/Retail_Data_Transactions.csv")
  for (line <- bufferedSource.getLines) {
    val Array(customer_id, trans_date, tran_amount) = line.split(",").map(_.trim)
    println(s"$customer_id $trans_date $tran_amount")
  }


  bufferedSource.close

}
