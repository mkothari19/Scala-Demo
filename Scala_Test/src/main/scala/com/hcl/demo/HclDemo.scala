package com.hcl.demo

object HclDemo {
  
  def printNumber(n:Int,sep:String):String = {
    var list = List[Int]()
    for (i<- 1 to n ) yield list:+=i
    list.mkString(sep)
  }
  
  def calculateAOT(base:Double,height:Double) = (base*height)/2
  
 def main(args: Array[String]): Unit = {
    println(printNumber(10,","))
    println(calculateAOT(5.0,10.0))
 } 
  
}