package modelingmath

import modelingmath.expression.Addition
import modelingmath.expression.Multiplication
import modelingmath.expression.Value
import modelingmath.expression.interfaces.Node

/**
 * Main solution class based on the challenge problem description
 */
class FactoryFunction {
    
    fun execute(): Number {
        val tree = makeDataTree()
        return tree.evaluate()
    }
    
    private fun makeDataTree(): Node {
        return Addition(
            Value(3), Multiplication(
                Value(5), Value(4)))
    }
}