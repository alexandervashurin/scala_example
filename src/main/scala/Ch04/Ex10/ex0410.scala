package Ch04 {
  package Ex10 {

    object ex0410 extends App {
      println()
      assert("Hello".zip("World").toArray[(Char, Char)].deep ==
        Array[(Char, Char)](('H', 'W'), ('e', 'o'), ('l', 'r'), ('l', 'l'), ('o', 'd')).deep)
    }

  }

}

