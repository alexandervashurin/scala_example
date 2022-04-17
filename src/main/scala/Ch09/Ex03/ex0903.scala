package Ch09 {
  package Ex03 {

    import scala.io.Source

    object ex0903 extends App {
      val src = Source.fromFile("/home/alex/github_example/scala_example/testFiles/Ch09ex03.txt", "UTF-8")
      src.mkString.split("\\s+").toArray.filter(_.length >= 12).foreach(println(_))
      src.close()
    }
  }
}

