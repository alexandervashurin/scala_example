package Ch04 {
  package Ex08 {

    object ex0408 extends App {
      def minmax(arr: Array[Int]): (Int, Int) = {
        (arr.min, arr.max)
      }

      assert(minmax(Array(6, 4, 7, 3, 15, 7)) == (3, 15))
    }

  }

}

