import scala.collection.mutable.ArrayBuffer

package Ch03 {

  package Ex08 {

    object ex0308 extends App {
      var array = ArrayBuffer(1, -5, 0, -5, 8, 6, 0, -6, -89, 0, 10, -6)
      var indexes = (for (i <- array.indices if array(i) < 0) yield i).toBuffer.sortWith(_ > _).dropRight(1)
      for (i <- indexes.indices) array.remove(indexes(i))
      assert(array == ArrayBuffer(1, -5, 0, 8, 6, 0, 0, 10))
    }

  }

}


