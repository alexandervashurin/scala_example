package Ch17 {
  package Ex06{
    object ex1706 extends App {
      def middle[T](data: Iterable[T]): T = {
       val list = data.toList
        list(list.length/2)
      }

      assert(middle("world") == 'r')
    }
  }
}

