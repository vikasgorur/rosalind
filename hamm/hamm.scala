import scala.io.Source._

object Hamm {
  def main(args: Array[String]) {
    val dnas  = stdin.mkString.split("\n")

    println(dnas(0).zip(dnas(1)).count({case (b1, b2) => b1 != b2}))
  }
}