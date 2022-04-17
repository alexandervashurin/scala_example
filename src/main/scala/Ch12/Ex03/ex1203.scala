package Ch12 {
  package Ex03 {
    object ex1203 extends App {
      def factorial(n: Int) = (1 to n).product
      assert(factorial(5) == 120)
    }
  }
}


