package Ch03 {

  package Ex07 {

    object ex0307 extends App {
      var array = Array(5, 6, 5, 3, 1, 85, 1, 85)
      array.distinct
      assert(array.distinct.deep == Array(5, 6, 3, 1, 85).deep)
    }

  }

}

