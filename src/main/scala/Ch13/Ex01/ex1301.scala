package Ch13 {
  package Ex01 {

    import scala.collection.{SortedSet, mutable}

    object ex1301 extends App {
      // LinkedHashMap обеспечит вывод элементов в порядке их добавления
      // SortedSet обеспечит вывод индексов в порядке возрастания
      def indexes(s: String): mutable.LinkedHashMap[Char, SortedSet[Int]] =
        s.zipWithIndex.foldLeft(mutable.LinkedHashMap[Char, SortedSet[Int]]())((res, el) =>
          res += (el._1 -> (res.getOrElse(el._1, SortedSet[Int]()) + el._2)))
      println(indexes("Mississippi").toString)
    }
  }
}

