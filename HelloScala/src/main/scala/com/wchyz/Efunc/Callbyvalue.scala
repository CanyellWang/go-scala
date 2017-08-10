package com.wchyz.Efunc

/**
  * Created by wangchangye on 2017/4/25.
  */
object Callbyvalue {

  def main(args: Array[String]): Unit = {
    delayed(time())
    print(printString("a","b","c"))
    for (i <- 1 to 10){
      println(fab(i))
    }

    println(add())
    println(add(1,2))

    println()
  }

  def time() = {
    println("acquire time by nanotime")
    System.nanoTime()
  }
  def delayed(t:Long): Unit ={
    println("delayed time in nano")
    println("get "+ t)
  }

  def printString(args:String*){
    var i= 0;
    for (arg <- args){
      println("arg value[" + i + "] = " + arg)
      i = i + 1;
    }
  }

  //递归
  def fab(n:Int) : BigInt ={
    if(n<= 1) 1
    else n * fab(n-1)
  }
  //默认参数
  def add(a:Int=0, b:Int=0):Int={
    return a+b;
  }
  //高阶函数
  def layout[A](x:A) = "[" + x.toString + "]";

  def apply(f:Int=>String,v:Int) = f(v)


  //匿名函数
  var inc = (x:Int) => x+1
  var mul = (x:Int,y:Int) => x+y

  //闭包
  var factor = 3;
  var multiplier = (i:Int) => i * factor




}//class
