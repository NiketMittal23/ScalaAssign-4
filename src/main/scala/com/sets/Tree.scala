package com.sets

object Tree {
  abstract class IntTree
  case object EmptyTree extends IntTree
  case class Node(elem: Int, left: IntTree, right: IntTree) extends IntTree

  def contains(treeNode: IntTree, value: Int): Boolean = treeNode match {
    case EmptyTree => false
    case Node(element, leftNode, rightNode) =>
      if (value < element) {
        contains(leftNode, value)
      }
      else if (value > element) {
        contains(rightNode, value)
      }
      else true
  }


  def insert(treeNode: IntTree, value: Int): IntTree = treeNode match {
    case EmptyTree => Node(value, EmptyTree, EmptyTree)
    case Node(element, leftNode, rightNode) =>
      if (value < element) {
        Node(element, insert(leftNode, value), rightNode)
      }
      else if (value > element) {
        Node(element, leftNode, insert(rightNode, value))
      }
      else treeNode
  }

  def main(args: Array[String]) {
    val tree = Node(10,Node(7,EmptyTree,EmptyTree),Node(15,EmptyTree,EmptyTree))
    println("Tree=" + tree)
    println(contains(tree, 7))
    println(contains(tree, 5))
  }


}
