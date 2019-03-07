package modelingmath.expression

import modelingmath.expression.interfaces.Node

/**
 * Adds two nodes together
 */
class Addition(private val leftNode: Node, private  val rightNode: Node): Operation(leftNode, rightNode) {
    override fun evaluate(): Number {
        return leftNode.evaluate().toDouble() + rightNode.evaluate().toDouble()
    }
}