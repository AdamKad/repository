

class Param[T1, T2](var fst:T1, var snd:T2) {
  override def toString = {
    "(" + fst + "," + snd + ")"
  }
}

val x = new Param[Int, String](1, "test")
println(x)