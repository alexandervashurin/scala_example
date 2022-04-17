import java.util.Calendar._

package Ch04 {
  package Ex06 {

    object ex0406 extends App {
      val daysOfTheWeek = scala.collection.mutable.LinkedHashMap(
        "Понедельник" -> java.util.Calendar.MONDAY,
        "Вторник" -> java.util.Calendar.TUESDAY,
        "Среда" -> java.util.Calendar.WEDNESDAY,
        "Четверг" -> java.util.Calendar.THURSDAY,
        "Пятница" -> java.util.Calendar.FRIDAY,
        "Суббота" -> java.util.Calendar.SATURDAY,
        "Воскреснье" -> java.util.Calendar.SUNDAY
      )
      for (d <- daysOfTheWeek) println(d)
    }

  }

}


