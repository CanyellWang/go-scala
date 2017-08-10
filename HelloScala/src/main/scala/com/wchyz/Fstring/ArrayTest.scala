package com.wchyz.Fstring

/**
  * Created by wangchangye on 2017/4/25.
  */
import Array._
object ArrayTest {

  def main(args: Array[String]): Unit = {

    var z = new Array[Any](3)
    z(0)="hello"
    z(1)="world"
    z(2)="you"
    println(z(0))
    println(z(1))
    println(z.toList)

    var z1 = Array(1,2,3,4,5)
    for(x<-z1){println(x)}

    println(z1.max)
  //合并
    var z2 = Array(6,7,8,9,10)
    var z3 = concat(z2,z1)
    for(x<-z3){
      println(x)
    }

    //range
    var z4 = range(10,15,1)
    for (x <- z4){
      print(" " + x)
    }



  }//main

}//class
