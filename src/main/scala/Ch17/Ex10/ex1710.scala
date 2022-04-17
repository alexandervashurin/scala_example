package Ch17 {
  package Ex10 {
    object ex1710 extends App {
      // ev - неявный параметр подтверждения - S должен быть равен T
      class Pair[S, T](var first: S, var second: T) {
        def swap(implicit ev1: S =:= T, ev2: T =:= S): Unit = {
          val tmp = first
          first = second
          second = tmp
        }
      }
      val p = new Pair("one", "two")
      p.swap
      assert(p.first == "two")
    }
  }
}

