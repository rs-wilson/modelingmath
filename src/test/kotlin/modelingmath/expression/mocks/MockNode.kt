package modelingmath.expression.mocks

import modelingmath.expression.interfaces.Node

class MockNode(override val size: Int, private val evaluation: Number): Node {

    override fun evaluate(): Number {
        return evaluation
    }
    
}