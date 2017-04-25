/**
  * Created by wangchangye on 2017/4/25.
  */
object Test5 {

  def addInt( a:Int, b:Int ) : Int = {
    var sum:Int = 0
    sum = a + b

    return sum
  }

  def main(args: Array[String]): Unit = {
    print(addInt(1,2))
  }
}
