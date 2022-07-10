package audius

import org.scalatest.flatspec.AnyFlatSpec

class Spec extends AnyFlatSpec {

  private val m = List(
    ("a", "b"),
    ("c", "b"),
    ("d", "e"),
    ("a", "d"),
    ("c", "d"),
    ("f", "g")
  )

  it should "recursively find paths" in {
    println(FindPath(("e", "a"), m = m))
    println(FindPath(("a", "e"), m = m))
    println(FindPath(("a", "d"), m = m))
    println(FindPath(("a", "c"), m = m))
    println(FindPath(("a", "b"), m = m))
    println(FindPath(("f", "g"), m = m))
    println(FindPath(("f", "a"), m = m))
  }

  it should "find paths that grow exponentially" in {
    val m2 = m :+ ("a", "c") :+ ("b", "d")
    println(FindPath(("a", "e"), m = m))
    println(FindPath(("a", "e"), m = m2))
  }

}
