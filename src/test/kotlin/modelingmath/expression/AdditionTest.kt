package modelingmath.expression

import io.kotlintest.shouldBe
import io.kotlintest.specs.ShouldSpec
import modelingmath.expression.mocks.MockNode

class AdditionTest : ShouldSpec() {
    init {

        "The addition node" {

            val left = MockNode(2, 3)
            val right = MockNode(4, 5)
            val addNode = Addition(left, right)

            should("return the addition of the execution of two nodes") {
                addNode.evaluate() shouldBe 8.0
            }
        }

    }
}