import scala.collection.JavaConversions.propertiesAsScalaMap

package Ch04 {
  package Ex07 {

    object ex0407 extends App {
      val props: scala.collection.Map[String, String] = System.getProperties()
      var size: Int = 0
      for (p <- props) {
        if (p._1.length > size)
          size = p._1.length
      }
      size += 2
      props.foreach(p => println(p._1 + " " * (size - p._1.length) + "|" + p._2))
    }

  }

}

