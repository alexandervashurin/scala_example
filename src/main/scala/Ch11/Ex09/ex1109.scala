package Ch11 {
  package Ex09 {

    object RichFile {
      def unapply(s: String): Option[(String, String, String)] = {
        // (.*[\/\\])*(.+)[.]([^.]+)
        // (        - группируем
        // .*       - любое количество любых знаков
        // [\/ \\]  - заканчивающееся \ или /
        // *        - любое количество раз
        // )        - закончилась группа пути
        // (.+)[.]  - группа имени файла - от 1 до бесконечности любых символов заканчивается точкой
        // ([^.]+)  - группа расширения - любые символы кроме точки от одного до бесконечности
        val r = """(.*[\/\\])*(.+)[.]([^.]+)""".r
        val r(p, n, e) = s
        Some(p, n, e)
      }
    }

    object ex1109 extends App {
      val RichFile(path, name, extension) = """/home/alex/github_example/scala_example/testFiles/proxy-2022-03-31.log"""
      assert(path == """/home/alex/github_example/scala_example/testFiles/""")
      assert(name == "proxy-2022-03-31")
      assert(extension == "log")
    }
  }
}

