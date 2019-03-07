package modelingmath.expression

import io.kotlintest.shouldBe
import io.kotlintest.specs.ShouldSpec
import modelingmath.expression.mocks.MockNode
import modelingmath.expression.mocks.MockOperation


class OperationTest : ShouldSpec() {
    init {

        "An operation node" {

            val left = MockNode(2, 3)
            val right = MockNode(4, 5)
            val oppNode = MockOperation(left, right)

            should("return the addition of the size of its two child nodes, plus one (for itself)") {
                oppNode.size shouldBe 7
            }
        }

    }
}