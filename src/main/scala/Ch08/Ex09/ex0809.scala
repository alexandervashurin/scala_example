package Ch08 {
  package Ex09 {
    class Creature {
      def range: Int = 10
      val env: Array[Int] = new Array[Int](range)
    }

    class Creature1 extends Creature {
      override def range = 3
    }
    class Creature2 extends Creature {
      override val range = 4
    }

    object ex0809 extends App {
      assert(new Creature1().env.length == 3)
      assert(new Creature2().env.length == 0)
    }
  }

}

