import scala.collection.immutable.StringOps


package Ch02 {

  package Ex07 {

    object ex0207 extends App {
      def productS(s: collection.immutable.StringOps): Long = {
        s.foldLeft(1L)(_ * _)
      }

      assert(productS("Hello") == 9415087488L)
    }

  }

}
