package Ch10 {
  package Ex09 {

    trait ConsoleLogger {
      def log(msg: String): Unit = println(msg)
    }

    trait BufferedInputStream extends java.io.InputStream with ConsoleLogger {
      private val bis = new java.io.BufferedInputStream(this, 20){
        override def read: Int = {
          // выводим содержимое буфера
          log(buf.map(_.toChar).mkString)
          super.read
        }
      }
      override def read: Int = {
        bis.read
      }
    }

    object ex1009 extends App {
      val is = new java.io.FileInputStream("/home/alex/github_example/scala_example/testFiles/Ch10ex08.txt") with BufferedInputStream
      var data = 0
      while (data != -1) {
        data = is.read
      }
    }
  }
}



