import scala.io.Source._

object Gc {
  def main(args: Array[String]) {
    var ids = Array[(String, Double)]()

    val input = stdin.mkString

    input.split(">").map ((str:String) => {
      val lines = str.split("\n")
      val dna   = lines.drop(1).mkString("")

      if (!lines(0).isEmpty)
        ids = ids :+ (lines(0), 1.0*(dna.count (c => (c == 'G' || c == 'C'))) / dna.length)
    })

    val maxGC = ids.maxBy(_._2)
    Console.printf("%s\n%f%%\n", maxGC._1, maxGC._2*100)
  }
}