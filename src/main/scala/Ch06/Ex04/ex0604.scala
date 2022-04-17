package Ch06 {
  package Ex04 {

    class Point(private val x: Int, private val y: Int) {
      def getX: Int = x

      def getY: Int = y
    }

    object Point {
      def apply(x: Int, y: Int) = new Point(x, y)
    }

    object ex0604 extends App {
      assert(Point(3, 5).getX == 3)
    }

  }

}



