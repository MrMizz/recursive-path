package audius

object FindPath {

  def apply(pair: (String, String), m: List[(String, String)]): List[List[(String, String)]] = {
    apply(leader = pair._2, target = pair._1, m = m, path = Nil)
  }

  private def apply(
    leader: String,
    target: String,
    m: List[(String, String)],
    path: List[(String, String)]
  ): List[List[(String, String)]] = {
    m.flatMap { tup =>
      if (tup._1 == leader) {
        if (tup._2 == target) {
          // end
          List(tup +: path)
        } else {
          // traverse
          apply(
            leader = tup._2,
            target = target,
            m = m.filterNot(_.eq(tup)),
            path = tup +: path
          )
        }
      } else if (tup._2 == leader) {
        if (tup._1 == target) {
          // end
          List(tup +: path)
        } else {
          // traverse
          apply(
            leader = tup._1,
            target = target,
            m = m.filterNot(_.eq(tup)),
            path = tup +: path
          )
        }
      } else {
        // dead end
        Nil
      }
    }
  }

}
