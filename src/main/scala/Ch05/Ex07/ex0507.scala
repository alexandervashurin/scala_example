package Ch05 {
  package Ex07 {
    object ex0507 extends App {
      class Person(str: String) {
        if (str.split(' ').length != 2)
          throw new IllegalArgumentException("String must contain name and surname divided by space.")
        private val n = str.split(' ')(0)
        private val s = str.split(' ')(1)

        def name: String = n
        def surname: String = s
      }

      var p = new Person("Sergei Ivanov")
      assert(p.name == "Sergei")
      assert(p.surname == "Ivanov")
    }
  }
}

