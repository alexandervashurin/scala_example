import scala.io.Source
import java.io.PrintWriter

package Ch09 {
  package Ex02 {
    object ex0902 extends App {
      // Стандартный размер табуляции - 8 пробелов.
      // Представим файл в виде сетки, раз в 8 символов - место "приземления" курсора по табуляции

      val spaces = 8 // размер сетки
      var count = 0 // сколько символов уже введено в ячейку

      val src = Source.fromFile("/home/alex/github_example/scala_example/testFiles/Ch09ex02.txt", "UTF-8")
      var out: String  = ""

      for(c <- src) {
        // Если достигли границы ячейки - скидываем счетчик в ноль
        if (count == 8) count = 0

        // Если табуляция, то вводим столько пробелов, сколько символов осталось до конца ячейки
        if (c == '\t') {
          out = out + " " * (spaces - count)
          count = 0 // сбрасываем счетчик символов в ячейке
        }
        // Если новая строка, то сбрасываем счетчик символов в ячейке
        else if (c == '\n') {
          count = 0
        }
        // Иначе - печатаем символ и увеличиваем счетчик
        else {
          out = out +  c
          count += 1
        }
      }
      src.close()
      var w = new PrintWriter("/home/alex/github_example/scala_example/testFiles/Ch09ex02.txt", "UTF-8")
      w.print(out)
      w.close()
    }
  }
}
/*
Файл таблицы с табуляциями
+---------------+---------------+---------------+---------------+---------+
| FirstColumn	|SecondColumn	| ThirdColumn 	| FourthColumn	| Result  |
+---------------+---------------+---------------+---------------+---------+
| blablablabla 	| bla		| blablacla	| c           	| df      |
+---------------+---------------+---------------+---------------+---------+
| c		| sfdsfsdfsdf	|		| dsd          	| fdfdgsd |
+---------------+---------------+---------------+---------------+---------+
|              	|		|		|		|         |
+---------------+---------------+---------------+---------------+---------+
*/


