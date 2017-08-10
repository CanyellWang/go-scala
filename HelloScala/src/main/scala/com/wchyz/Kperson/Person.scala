package com.wchyz.Kperson

/**
  * Created by wangchangye on 2017/4/25.
  */
class Person {
  val id = "9527"
  var name = "小王"
  private var age = 18

  override def toString = s"Person($id, $name, $age)"
}
//伴生对象
object Person{
  def main(args: Array[String]): Unit = {
    val p = new Person
    p.id
    p.name
    println(p.toString)

    val lines = List("hello tom hello jerry", "hello jerry", "hello kitty")
    lines.flatMap(_.split(" ")).map((_, 1)).groupBy(_._1).mapValues(_.foldLeft(0)(_+_._2))
    lines.flatMap(_.split(" ")).map((_, 1)).groupBy(_._1).map(t=>(t._1, t._2.size)).toList.sortBy(_._2).reverse
    print(lines.flatMap(_.split(" ")).map((_, 1)).groupBy(_._1).map(t=>(t._1, t._2.size)).toList.sortBy(_._2).reverse)
  }

}