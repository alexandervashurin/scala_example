package Ch06 {
  package Ex08 {

    import Ch06.Ex08

    object RGBCube extends Enumeration {
      type RGBCube = Value
      val White: Ex08.RGBCube.Value = Value(0xFFFFFF)
      val Cyan: Ex08.RGBCube.Value = Value(0x00FFFF)
      val Green: Ex08.RGBCube.Value = Value(0x00FF00)
      val Yellow: Ex08.RGBCube.Value = Value(0xFFFF00)
      val Red: Ex08.RGBCube.Value = Value(0xFF0000)
      val Magenta: Ex08.RGBCube.Value = Value(0xFF00FF)
      val Blue: Ex08.RGBCube.Value = Value(0x0000FF)
      val Black: Ex08.RGBCube.Value = Value(0x000000)
    }

    object ex0608 extends App {
      for (rgb <- RGBCube.values) println(rgb.id + ": " + rgb)
    }

  }

}



