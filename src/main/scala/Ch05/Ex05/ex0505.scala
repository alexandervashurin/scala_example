import scala.reflect._

package Ch05 {
  package Ex05 {

    import scala.beans.BeanProperty

    object ex0505 extends App {

      class Student(@BeanProperty var name: String, @BeanProperty var id: String) {}

      var s = new Student("Petrov", "1")
      s.setName("Ivanov")
      assert(s.getName() == "Ivanov")
    }
  }
}



