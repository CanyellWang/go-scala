package com.wchyz.Kperson

/**
  * Created by wangchangye on 2017/4/25.
  */
class Ps(val id:Int,var name:String) {

}
object Ps{
  def main(args: Array[String]): Unit = {
    val p = new Ps(12,"aaa")
    println(p.id)
    println(p.name)
    p.name = "bbb"
    println(p.name)
  }
}
