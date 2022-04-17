package Ch11 {
  package Ex06 {
    class AsciiArt(art: String) {
      private val strings = art.split("\r\n")

      def draw(): Unit = print(strings.mkString("\r\n"))
      // Приняла, что по горизонтали располагать элементы должно быть приоритетнее, чем по вертикали
      // потому :+  - по горизонтали
      //        |+  - по вертикали
      def width: Int = strings.map(_.length).max
      def height: Int = strings.length
      def rightString(str: String): String = if (str.length < width) str + " " + " "*(width - str.length) else str + " "

      def :+ (other: AsciiArt): AsciiArt = {
        val h = math.max(height, other.height)
        val res = (for(i <- 0 to h) yield  {
          (strings.isDefinedAt(i), other.strings.isDefinedAt(i)) match  {
            case (true, true) => rightString(strings(i)) + other.strings(i)
            case (false, true) => " "* width + other.strings(i)
            case (true, false) => strings(i)
            case (_, _) => " "
          }
        }).mkString("\r\n")
        new AsciiArt(res)
      }

      def |+ (other: AsciiArt): AsciiArt = {
        new AsciiArt(strings.mkString("\r\n") + other.strings.mkString("\r\n"))
      }
    }

    object ex1106 extends App {
      val a = (new AsciiArt(Ch11.Ex06.Drawings.a)) :+ (new AsciiArt(Ch11.Ex06.Drawings.b))
      val b = (new AsciiArt(Ch11.Ex06.Drawings.b)) :+ (new AsciiArt(Ch11.Ex06.Drawings.a))
      val c = a |+ b
      c.draw()
    }
  }
}

