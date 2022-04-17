package Ch13 {
  package Ex05 {
    object ex1305 extends App {
      def mkString(coll: scala.collection.Traversable[Any], sep: String) =
        coll.reduceLeft(_.toString + sep + _.toString)

      println(mkString(Array(1, 2, 3), "-"))
    }
  }
}

