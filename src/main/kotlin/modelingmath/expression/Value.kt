package modelingmath.expression

import modelingmath.expression.interfaces.Node

/**
 * A node that represents a single numeric value.
 */
internal class Value(private val number: Number): Node {
    override val size: Int
        get() = 1

    override fun evaluate(): Number {
        return number
    }
}