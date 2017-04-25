import scala.util.matching.Regex

/**
  * Created by wangchangye on 2017/4/25.
  */
object Retest {

  def main(args: Array[String]): Unit = {
    val pattern = new Regex("abl[ae]\\d+")
    println(pattern.findAllIn("ablaw is able1 and cool").mkString)


    val pattern2 = "(S|s)cala".r
    val str = "Scala is scalable and cool"

    println(pattern2 replaceFirstIn(str, "Java"))

  }

}
