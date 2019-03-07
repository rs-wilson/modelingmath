package modelingmath.expression

import io.kotlintest.shouldBe
import io.kotlintest.specs.ShouldSpec

class ValueTest : ShouldSpec() {
    init {

        "The value node" {
            
            should("have a size of 1") {
                Value(5).size shouldBe 1
            }
            
            should("evaluate to the value it is constructed with") {
                Value(5).evaluate() shouldBe 5.0
            }
        }

    }
}