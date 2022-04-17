package Ch12 {
  package Ex04 {
    object ex1204 extends App {
      def factorial(n: Int) = (1 to n).product
      assert(factorial(5) == 120)
    }
  }
}




