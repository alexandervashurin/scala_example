package Ch06 {
  package Ex07 {

    import Ch06.Ex07

    object CardSuite extends Enumeration {
      type CardSuite = Value
      val Hearts: Ex07.CardSuite.Value = Value("\u2665")
      val Christen: Ex07.CardSuite.Value = Value("\u2663")
      val Diamonds: Ex07.CardSuite.Value = Value("\u2666")
      val Spades: Ex07.CardSuite.Value = Value("\u2660")
    }

    object ex0607 extends App {
      def isRed(s: CardSuite.CardSuite): Boolean = {
        s == CardSuite.Hearts || s == CardSuite.Diamonds
      }

      assert(isRed(CardSuite.Hearts))
      assert(isRed(CardSuite.Diamonds))
      assert(!isRed(CardSuite.Christen))
      assert(!isRed(CardSuite.Spades))
    }
  }
}

