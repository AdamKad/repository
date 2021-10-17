trait Debug {
  def debugName(): Unit = {
    println("Klasa: " + getClass.getSimpleName )    //Zamiast getSimpleName mo¿na u¿yæ getName jednak wtedy wypisuje te¿ nazwê pakietu
  }

  def debugVars(): Unit = {
    val fields = getClass.getDeclaredFields
    for (field <- fields) {
      field.setAccessible(true)
      println("Pole: " + field.getName + " => " + field.getType + ", " + field.get(this))
    }
  }
}
