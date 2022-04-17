package Ch18 {
  package Ex04 {
    import scala.collection.mutable.ArrayBuffer

    class Network { outer =>     // псевдоним для Network.this (см. глава 5.8 Вложенные классы)
        class Member(val name: String) {
          val network: Network = outer
          override def equals(that: scala.Any): Boolean = this.network == that.asInstanceOf[Member].network
          // Будем считать, что в контактах могут быть члены любых сетей
          val contacts = new ArrayBuffer[Network#Member]
        }

        private val members = new ArrayBuffer[Member]

        def join(name: String): Member = {
          val m = new Member(name)
          members += m
          m
        }
    }

    object ex1804 extends App {
      val chatter = new Network
      val myFace = new Network

      val fred = chatter.join("Fred")
      val barney = myFace.join("Barney")
      val john = chatter.join("John")

      assert(!fred.equals(barney))
      assert(fred.equals(john))
    }
  }
}

