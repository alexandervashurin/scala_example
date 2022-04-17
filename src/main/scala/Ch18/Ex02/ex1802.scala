package Ch18 {
  package Ex02 {
    object show
    object then
    object around

    class Bug {
      var pos: Int = 0
      var goForward: Boolean = true

      def turn(obj: around.type): Bug = {
        goForward = !goForward
        this
      }
      def move(steps: Int): Bug = {
        pos = if (goForward) pos + steps else pos - steps
        this
      }
      def showPos: Bug = {
        println(pos.toString)
        this
      }

      def and(obj: show.type): Bug = this.showPos
      def and(obj: then.type): Bug = this
    }

    object ex1802 extends App {
      val bugsy = new Bug
      bugsy move 4 and show and then move 6 and show turn around move 5 and show
    }
  }
}

