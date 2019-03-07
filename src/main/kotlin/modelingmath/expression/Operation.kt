package modelingmath.expression

import modelingmath.expression.interfaces.Node

/**
 * The operation node should be implemented with a function that evaluates two child nodes
 */
abstract class Operation(private val leftNode: Node, private val rightNode: Node): Node {
    override val size: Int
        get() = leftNode.size + rightNode.size
}