package Ch09 {
  package Ex04 {

    import scala.io.Source

    object ex0904 extends App {
      val src = Source.fromFile("/home/alex/github_example/scala_example/testFiles/Ch09ex04.txt", "UTF-8")
      val numbers: Array[Double] = src.mkString.split(" +").map(_.toDouble)

      println(numbers.mkString(", "))

      val sum = numbers.foldLeft(0.0)(_ + _)

      println("Sum is " + sum.toString)
      println("Average is " + (sum/numbers.length).toString)
      println("Min is " + numbers.min.toString)
      println("Max is " + numbers.max.toString)

      src.close()
    }
  }
}

