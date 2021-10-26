package com.sets
import org.scalatest.funsuite.AnyFunSuite

class TestSetsMethod extends AnyFunSuite {

  val set = new SetsMethods

  val set1: Set[Int] = Set(1,2,3,4,5)
  val set2: Set[Int] = Set(4,5,6,7)

  test("Set Union Test") {
    assert(set.setUnion(set1, set2) === set1.union(set2))
  }

  test("Set Intersect Test") {
    assert(set.setIntersect(set1, set2) === set1.intersect(set2))
  }
}
