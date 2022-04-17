package Ch11 {
  package Ex07 {
    class BitSequence(var bits: Long = 0) {
      def apply(index:Byte):Boolean = (bits & (1 << index)) > 0
      def update(index:Byte, value:Boolean): Unit = {
        if (value)
          bits |= (1 << index)
        else
          bits &= ~(1 << index)
      }
    }
    object ex1107 extends App {
      val bs = new BitSequence(5) // 101
      assert(bs(0))
      assert(!bs(1))
      assert(bs(2))
      assert(!bs(3))
      bs(3) = true                // 1010 == 13
      assert(bs.bits == 13)
    }
  }
}

