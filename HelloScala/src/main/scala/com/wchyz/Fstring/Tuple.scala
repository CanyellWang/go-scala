package com.wchyz.Fstring

/**
  * Created by wangchangye on 2017/4/25.
  */
object TupleTest {

  def main(args: Array[String]): Unit = {

    val t = (1,3.14,"fred")

    val v = new Tuple4(1,2.3,"ha","en")

    val s = (1,2,3,4,5)
    val sum = s._1+s._2
    println(sum)

    //遍历迭代输出
    s.productIterator.foreach(i=>print(i))

    val sites = Map("runoob" -> "www.runoob.com", "google" -> "www.google.com")

    println("show(sites.get( \"runoob\")) : " +
      show(sites.get( "runoob")) )
    println("show(sites.get( \"baidu\")) : " +
      show(sites.get( "baidu")) )

    val ita = Iterator(Array(1,2,3))
    val itab = Iterator(1,2,3,4,5)
    println(itab.length)



  }//main

  def show(x: Option[String]) = x match {
    case Some(s) => s
    case None => "?"
  }


}
