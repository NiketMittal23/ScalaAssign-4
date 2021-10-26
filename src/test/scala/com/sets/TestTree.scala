package com.sets
import com.sets.Tree.{EmptyTree, Node}
import org.scalatest.funsuite.AnyFunSuite

class TestTree extends AnyFunSuite {
  val t = Tree
  val tree = Node(10,Node(7,EmptyTree,EmptyTree),Node(15,EmptyTree,EmptyTree))

  test("Test contain value") {
    assert(t.contains(tree, 7))
  }
  test("Test did not contain the value") {
    assert(!t.contains(tree, 9))
  }

}
