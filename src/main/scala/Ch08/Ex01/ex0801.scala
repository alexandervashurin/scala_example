package Ch08 {
  package Ex01 {

    class BankAccount(initialBalance: Double) {
      protected var balance: Double = initialBalance

      def deposit(amount: Double): Unit = {
        balance += amount
      }

      def withdraw(amount: Double): Unit = {
        balance -= amount
      }

      def current: Double = balance
    }

    class CheckingAccount(initialBalance: Double) extends BankAccount(initialBalance) {
      private def getComission(): Unit = {
        balance -= 1.0
      }

      override def deposit(amount: Double): Unit = {
        super.deposit(amount)
        getComission()
      }

      override def withdraw(amount: Double): Unit = {
        super.withdraw(amount)
        getComission()
      }
    }

    object ex0801 extends App {
      var acc = new CheckingAccount(0.0)
      acc.deposit(10.0)
      assert(acc.current == 9.0)
      acc.withdraw(3)
      assert(acc.current == 5.0)
    }

  }

}
