import java.util.Scanner
import scala.collection.mutable

package Ch04 {
  package Ex02 {

    object ex0402 extends App {
      var in = new java.util.Scanner(new java.io.File("/home/alex/github_example/scala_example/testFiles/Ch04ex02.txt"))
      var words = new mutable.HashMap[String, Int]()
      while (in.hasNext()) {
        var k = in.next()
        words(k) = words.getOrElse(k, 0) + 1
      }
      for ((k, v) <- words) printf("Word %s contains %d times\n", k, v)
    }

  }

}

