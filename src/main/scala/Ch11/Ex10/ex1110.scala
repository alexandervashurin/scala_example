package Ch11 {
  package Ex10 {

    object RichFile {
      def unapplySeq(s: String): Option[Seq[String]] = {
        if (s.trim == "") None else Some(s.split("""[\/|\\]""").filter(_ !=""))
      }
    }

    object ex1110 extends App {
      // переменной s присваивается некая последовательность
      val RichFile(s @ _*) = """/home/alex/github_example/scala_example/testFiles/proxy-2022-03-31.log"""
      println(s.toString)
    }
  }
}



