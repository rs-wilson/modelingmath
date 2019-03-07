package modelingmath.expression.mocks

import modelingmath.expression.Operation
import modelingmath.expression.interfaces.Node

class MockOperation(leftNode: Node, rightNode: Node): Operation(leftNode, rightNode) {

    override fun evaluate(): Number {
        throw NotImplementedError("Don't use this mock class to test evaluations.")
    }

}