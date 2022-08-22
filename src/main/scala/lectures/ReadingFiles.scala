package lectures

import java.io.File
import java.util.Scanner
import scala.io.Source

object ReadingFiles extends App {

  val filePath = "src/main/resources/DGMD_FINAL_PROJECT_Q_A - QandA.csv"

  // version 1 - The Java way

  val file = new File(filePath)
  val scanner = new Scanner(file)
  //  while(scanner.hasNextLine) {
  //    val line = scanner.nextLine()
  //    println(line)
  //  }


  //version 3 - The scala way

  //  val scalaFileContents: Iterator[String] = Source.fromFile(file).getLines
  //  scalaFileContents.foreach(println)

  //version 4 - open("path").read enhances the file type built into Java through the implicit class
  //

  def open(path: String) = new File(path)

  implicit class RichFile(file: File) {
    def read() = Source.fromFile(file).getLines
  }

  val readLikeABoss = open(filePath).read()
  readLikeABoss.foreach(println)

}
