import scala.collection.immutable.StringOps


package Ch02 {

  package Ex09 {

    object ex0209 extends App {
      def productS(s: collection.immutable.StringOps): Long = {
        if (s.isEmpty) 1
        else s.head * productS(s.tail)
      }

      assert(productS("Hello") == 9415087488L)
    }

  }

}
