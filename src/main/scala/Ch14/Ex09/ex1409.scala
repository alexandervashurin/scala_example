package Ch14 {
  package Ex09 {
    object ex1409 extends App {
      def sumOption(l: List[Option[Int]]) = l.flatten.sum

      val l = List(Some(3), None, Some(5))
      assert(sumOption(l) == 8)
    }
  }
}

