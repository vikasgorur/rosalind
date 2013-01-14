import scala.io.Source._

object Revc {
  def main(args: Array[String]) {
    val input = stdin.mkString

    val output = input.reverse.map ((c:Char) => {
      c match {
        case 'A' => 'T'
        case 'T' => 'A'
        case 'G' => 'C'
        case 'C' => 'G'
        case  c  => c
      }
    })

    println(output)
  }
}