package Ch14 {
  package Ex02 {
    object ex1402 extends App {
      def swap(p: (Int, Int)): (Int, Int) = p match {
        case (x, y) => (y, x)
      }

      assert(swap((6, 3)) == (3, 6))
    }
  }
}

