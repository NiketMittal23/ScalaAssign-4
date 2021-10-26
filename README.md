# ScalaAssign-4

1. Write methods union and intersection to form the union and intersection between two sets.



2. Consider the following definitions representing trees of integers.
These definitions can be seen as an alternative representation of IntSet: 


abstract class IntTree
case object EmptyTree extends IntTree
case class Node(elem: Int, left: IntTree, right: IntTree) extends IntTree


Complete the following implementations of the function contains and insert for
IntTree’s.


def contains(t: IntTree, v: Int): Boolean = t match { ...
...
}


def insert(t: IntTree, v: Int): IntTree = t match { ...
...
}
