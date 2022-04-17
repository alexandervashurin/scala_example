import scala.collection.JavaConversions.mapAsScalaMap


package Ch04 {
  package Ex05 {

    import java.util
    import scala.collection.mutable

    object ex0405 extends App {
      var in = new java.util.Scanner(new java.io.File("/home/alex/github_example/scala_example/testFiles/Ch04ex02.txt"))
      val treeWordsCounter = new util.TreeMap[String, Int]()

      while (in.hasNext()) {
        var k = in.next()
        if (treeWordsCounter.contains(k)) treeWordsCounter(k) += 1 else treeWordsCounter(k) = 1
      }
      val wordsCount: mutable.Map[String, Int] = treeWordsCounter
      for ((k, v) <- wordsCount) printf("Word %s contains %d times\n", k, v)
    }

  }

}

