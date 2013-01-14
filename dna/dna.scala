import scala.io.Source;

object Dna {
  def main(args: Array[String]) {
    val input = Source.stdin.mkString
    println ("ACGT" map (input count _.==) mkString " ")
  }
}
