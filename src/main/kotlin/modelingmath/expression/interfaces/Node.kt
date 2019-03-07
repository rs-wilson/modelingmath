package modelingmath.expression.interfaces

/**
 * Represents a mathematical tree.
 */
interface Node {
    val size: Int
    fun evaluate(): Number
}