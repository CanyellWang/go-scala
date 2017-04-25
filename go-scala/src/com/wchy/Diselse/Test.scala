/**
  * Created by wangchangye on 2017/4/25.
  */
object Test4 {

  def main(args: Array[String]): Unit = {
    var x = 20;
    if(x<20){
      println("x<20")
    }else{
      println("x>20")
    }

    for (a <- 1 to 10){
      println(a)
    }
    var numlist = List(1,2,3,4,5)
    for (a<-numlist){
      print(a)
    }

    for(a<-numlist if a != 3 && a<5){println(a)}



  }



}
