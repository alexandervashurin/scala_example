import scala.collection.mutable.ArrayBuffer

package Ch03 {

  package Ex03 {

    object ex0303 extends App {
      def isOdd(n: Int): Boolean = {
        n % 2 == 0
      }

      def replaceElsInArray(arr: Array[Int]): Array[Int] = {
        (for (i <- arr.indices) yield {
          if (isOdd(i) && i < arr.length - 1) arr(i + 1)
          else if (!isOdd(i)) arr(i - 1)
          else arr(i)
        }).toArray
      }

      assert(replaceElsInArray(Array(1, 2, 3, 4)).deep == Array(2, 1, 4, 3).deep)
      assert(replaceElsInArray(Array(1, 2, 3)).deep == Array(2, 1, 3).deep)
    }

  }

}


