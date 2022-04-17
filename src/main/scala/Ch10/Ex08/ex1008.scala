package Ch10 {
  package Ex08 {

    trait BufferedInputStream extends java.io.InputStream {
      private val is = new java.io.BufferedInputStream(this, 20)
      override def read: Int = {
        is.read
      }
    }

    object ex1008 extends App {
      val is = new java.io.FileInputStream("/home/alex/github_example/scala_example/testFiles/Ch10ex08.txt") with BufferedInputStream
      var data = 0
      while (data != -1) {
        data = is.read
      }
    }
  }
}



