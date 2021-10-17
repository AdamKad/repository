


object Main {
  def main(args: Array[String]): Unit = {
    val point = new Point(11, 33)
    val person = new Person("Adam", 21)

    println("Zadanie 1: ")
    point.debugName()
    person.debugName()

    println("\nZadanie 2: ")
    point.debugVars()
    println()
    person.debugVars()
  }
}
