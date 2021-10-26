package com.sets

class SetsMethods {
  def setUnion(a: Set[Int], b: Set[Int]): Set[Int] = {
    val union = a.++(b)
    union
  }
  def setIntersect(a: Set[Int], b: Set[Int]): Set[Int] = {
    val intersect = a.&(b)
    intersect
  }
}
object run extends App{
  val v = new SetsMethods
  println(v.setUnion(Set(1,2,3,4,5), Set(4,5,6,7)))
}
