import java.io.FileReader

/**
  * Created by wangchangye on 2017/4/25.
  */
object TestException {

  def main(args: Array[String]){
    try{
      val f = new FileReader("input.txt")
    }catch {
      case e:Exception => println("excetion")

    }finally {
      println("finally")
    }
  }//
}
