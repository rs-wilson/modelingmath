package modelingmath.expression

import modelingmath.expression.interfaces.Node

/**
 * Multiplies two nodes together.
 */
class Multiplication(private val leftNode: Node, private  val rightNode: Node): Operation(leftNode, rightNode) {
    override fun evaluate(): Number {
        return leftNode.evaluate().toDouble() * rightNode.evaluate().toDouble()
    }
}