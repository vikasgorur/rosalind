import scala.io.Source._;

object Rna {
  def main(args: Array[String]) {
    println(stdin.mkString.replace('T', 'U'))
  }
}