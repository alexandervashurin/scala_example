package Ch06 {
  package Ex06 {

    import Ch06.Ex06

    object CardSuite extends Enumeration {
      type CardSuite = Value
      val Hearts: Ex06.CardSuite.Value = Value("\u2665")
      val Christen: Ex06.CardSuite.Value = Value("\u2663")
      val Diamonds: Ex06.CardSuite.Value = Value("\u2666")
      val Spades: Ex06.CardSuite.Value = Value("\u2660")
    }

    object ex0606 extends App {
      for (s <- CardSuite.values) println(s.id + ": " + s)
    }
  }
}

