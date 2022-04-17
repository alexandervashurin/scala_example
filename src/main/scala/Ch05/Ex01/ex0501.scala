package Ch05 {
  package Ex01 {

    object ex0501 extends App {

      class Counter {
        private var value: Int = 0

        def increment(): Unit = {
          if (value < Int.MaxValue) value += 1
        }

        def current: Int = value
      }

      var c = new Counter()
      var i = 0L
      while (i <= Int.MaxValue) {
        c.increment()
        i += 1
      }
      assert(c.current == Int.MaxValue)
    }
  }
}
