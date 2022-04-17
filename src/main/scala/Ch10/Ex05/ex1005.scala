package Ch10 {
  package Ex05 {
    import java.awt.Point

    trait PropertyChangeSupport {
      private val pcs = new java.beans.PropertyChangeSupport(this)
      def addPropertyChangeListener(listener: java.beans.PropertyChangeListener): Unit =
        this.pcs.addPropertyChangeListener(listener)
      def removePropertyChangeListener(listener: java.beans.PropertyChangeListener): Unit =
        this.pcs.removePropertyChangeListener(listener)
      def firePropertyChange(propertyName: String, oldValue: Any, newValue: Any): Unit = {
        println("Событие " + propertyName + ", старое значение: " + oldValue.toString + ", новое значение " + newValue.toString)
        pcs.firePropertyChange(propertyName, oldValue, newValue)
      }
    }

    class BeanPoint extends java.awt.Point with PropertyChangeSupport {
      override def setLocation(x: Int, y: Int): Unit = {
        firePropertyChange("setLocation", getLocation, new Point(x, y))
        super.setLocation(x, y)
      }

      override def move(x: Int, y: Int): Unit = {
        firePropertyChange("move", getLocation, new Point(x, y))
        super.move(x, y)
      }

      override def translate(dx: Int, dy: Int): Unit = {
        firePropertyChange("move", getLocation, new Point(x + dx, y + dy))
        super.translate(dx, dy)
      }
    }
    object ex1005 extends App {
      val p = new BeanPoint()
      p.setLocation(1, 0)
      p.translate(3, 4)
    }
  }
}

