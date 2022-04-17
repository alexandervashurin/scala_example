package Ch17 {
  package Ex01 {
    object ex1701 extends App {
      class Pair[T, S](val first: T, val second: S) {
        def swap: Pair[S, T] = new Pair[S, T](second, first)
        def == (other: Pair[T, S]) : Boolean = (first == other.first) && (second == other.second)
      }

      val p = new Pair[Int, String](5, "five")
      assert(p.swap == new Pair[String, Int]("five", 5))
    }
  }
}

