package Ch12 {
  package Ex08 {
    object ex1208 extends App {
      val a = Array("Hello", "world!")
      val b = Array(5, 6)
      assert(a.corresponds(b)(_.length == _))
    }
  }
}


