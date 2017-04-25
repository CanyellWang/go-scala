/**
  * Created by wangchangye on 2017/4/25.
  */
object StringTest {

  def main(args: Array[String]): Unit = {

    var gr = "hello netty"
    var gr1:String = "hello netty"
    println(gr1)

    //nb了  直接调java 没毛病
    val buf = new StringBuffer();
    buf.append("h").append("e").append("llo")
    System.out.print(buf.toString)

    val sb = new StringBuilder;
    sb.+("a")
    sb.++=("aaa")
    println(sb.toString())

    var pal = "www.baidul.com"
    println(pal.length)

    println("hello".concat("\tworld"))

    println("sl"+"ee"+"p")
    println("sl".concat("ee").concat("p"))
    //http://www.runoob.com/scala/scala-strings.html



  }//main
}//class
