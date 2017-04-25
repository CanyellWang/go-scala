/**
  * Created by wangchangye on 2017/4/25.
  */
object Collectiontest {


  def main(args: Array[String]): Unit = {

    val site:List[Any] = List("a","b","c")

    val nums: List[Nothing]=List()

    val dim:List[List[Int]] = List(
      List(1,2,3),
      List(4,5,6),
      List(7,8,9)
    )

    val set = Set(1,2,3)
    println(set.getClass.getName)
    println(set.exists(_%2==0))
    println(set.drop(1).toList)

    var A:Map[Char,Int] = Map()
    val colors = Map("red" -> 1,"blue"->2)
    println(colors.keys)

  }
}
