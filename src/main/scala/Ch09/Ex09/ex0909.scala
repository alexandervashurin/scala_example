import java.io.File

package Ch09 {
  package Ex09 {
    object ex0909 extends App {
      def subdirs(dir: File): Iterator[File] = {
        val children = dir.listFiles.filter(_.isDirectory)
        children.toIterator ++ children.toIterator.flatMap(subdirs)
      }
      // .*(.class)\b - в начале - что угодно, заканчивается сочетанием .class
      val pattern = """(.class)\b""".r
      var count = 0

      for(dir <- subdirs(new File("/home/alex/github_example/scala_example/testFiles/"))) {
        count += dir.listFiles
          .filter(_.isFile).count((file: File) => file.getName.matches(".*(.class)\\b"))
      }
      println("Count = " + count.toString)
    }
  }
}

