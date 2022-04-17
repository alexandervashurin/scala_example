package Ch12 {
  package Ex02 {
    object ex1202 extends App {
      assert(Array(1, 5, 3, 6, 2).reduceLeft(math.max) == 6)
    }
  }
}

