import scala.io.Source._

object Subs {
  def main(args: Array[String]) {
    val lines = stdin.mkString.split("\n")

    val s = lines(0)
    val t = lines(1)

    var locations: List[Int] = List()
    var index                = s.indexOf(t)

    while (index != -1) {
      locations = index :: locations
      index     = s.indexOf(t, index + 1)
    }

    println(locations.map({_ + 1}).mkString(" "))
  }
}