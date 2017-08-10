package com.wchyz.Gclass

/**
  * Created by wangchangye on 2017/4/25.
  */

  object Imatch{
    def main(args: Array[String]): Unit = {
      println(3)
    }
    def matchTest(x:Int): String = x match{
      case 1 => "one"
      case 2 => "two"
      case 3 => "three"

    }
  }
