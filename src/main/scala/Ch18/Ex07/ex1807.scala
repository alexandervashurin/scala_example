package Ch18 {
  package Ex07 {
    class Window {
      def close(): Unit = {
        println("window is closed")
      }
    }

    object ex1807 extends App {
      def closeAfterProcess[T <: {def close(): Unit}](obj: T, process: T => Unit): Unit = {
        try {
          process(obj)
        } finally {
          obj.close()
        }
      }
      val w = new Window()
      def ventilateRoom(w: Window): Unit = {
        println("Open the window for ventilate the room")
      }
      closeAfterProcess(w, ventilateRoom)
    }
  }
}

