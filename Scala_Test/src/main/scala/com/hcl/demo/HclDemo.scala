package com.hcl.demo

object HclDemo {
  
  def printNumber(n:Int,sep:String):String = {
    var list = List[Int]()
    for (i<- 1 to n ) yield list:+=i
    list.mkString(sep)
  }
  
  def calculateAOT(base:Double,height:Double) = (base*height)/2
  
 def main(args: Array[String]): Unit = {
    
    
    println("Code that prints the numbers 1,2,3,4,5,6,7,8,9,10 \n"+printNumber(10,","))
    println("Code that calculates the area of a triangle \n"+calculateAOT(5.0,10.0))
 } 
  
}