package Ch05 {
  package Ex08 {

    object ex0508 extends App {

      class Car(private val model: String, private val corp: String) {
        private var year: Int = -1
        private var regNum: String = ""

        def this(model: String, corp: String, year: Int) {
          this(model, corp)
          this.year = year
        }

        def this(model: String, corp: String, regNum: String) {
          this(model, corp)
          this.regNum = regNum
        }

        def this(model: String, corp: String, year: Int, regNum: String) {
          this(model, corp)
          this.year = year
          this.regNum = regNum
        }

        def setRegNum(regNum: String): Unit = {
          this.regNum = regNum
        }
      }

      var myCar = new Car("Jazz", "Honda", "2008")
    }

  }

}


