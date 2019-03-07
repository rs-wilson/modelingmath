package modelingmath.expression

import io.kotlintest.shouldBe
import io.kotlintest.specs.ShouldSpec
import modelingmath.expression.mocks.MockNode

class MultiplicationTest : ShouldSpec() {
    init {

        "The multiplication node" {

            val left = MockNode(2, 3)
            val right = MockNode(4, 5)
            val multiplyNode = Multiplication(left, right)
            
            should("return the multiplication of the execution of two nodes") {
                multiplyNode.evaluate() shouldBe 15.0
            }
        }

    }
}