package Ch05 {
  package Ex02 {

    object ex0502 extends App {

      class BankAccount(private var current: Int = 0) {
        def deposit(value: Int): Unit = {
          current += value
        }

        def withdraw(value: Int): Unit = {
          current -= value
        }

        def balance: Int = current
      }

      var acc = new BankAccount(100)
      println(acc.deposit(10))
      acc.withdraw(30)
      println(acc.balance)
    }
  }
}

