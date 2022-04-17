import scala.collection.immutable.StringOps


package Ch02 {

  package Ex06 {

    object ex0206 extends App {
      def productS(s: collection.immutable.StringOps): Long = {
        var res: Long = 1L
        for (i <- s) res *= i.toLong
        res
      }
      println(productS("123"))
      assert(productS("Hello") == 9415087488L)
    }

  }

}
