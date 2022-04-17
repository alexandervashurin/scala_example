import java.io._

package Ch09 {
  package Ex10 {
    @SerialVersionUID(42L) class Person(val name: String) extends Serializable {
      private val friends = new collection.mutable.ArrayBuffer[Person]
      def addFriend(p: Person): Unit = {friends += p}
      def isFriendOf(p: Person): Boolean = friends.contains(p)
    }

    object ex0910 extends App {
      val kirill = new Person("Kirill")
      val mary = new Person("Mary")
      val dmitry = new Person("Dmitry")

      kirill.addFriend(mary)
      kirill.addFriend(dmitry)
      mary.addFriend(kirill)
      val persons = Array(kirill, mary, dmitry)

      val out = new ObjectOutputStream(new FileOutputStream("/home/alex/github_example/scala_example/testFiles/Ch09ex10.obj"))
      out.writeObject(persons)
      out.close()

      val in = new ObjectInputStream(new FileInputStream("/home/alex/github_example/scala_example/testFiles/Ch09ex10.obj"))
      val Array(newKirill, newMary, newDmitry) = in.readObject().asInstanceOf[Array[Person]]
      in.close()

      assert(newKirill.isFriendOf(newMary))
      assert(newKirill.isFriendOf(newDmitry))
      assert(!newMary.isFriendOf(newDmitry))
    }
  }
}

