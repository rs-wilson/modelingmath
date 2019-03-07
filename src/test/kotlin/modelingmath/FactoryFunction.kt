package modelingmath

import io.kotlintest.shouldBe
import io.kotlintest.specs.ShouldSpec

class ShouldSpecExampleTest : ShouldSpec() {
    init {

        "A FactoryFunction object" {
            "when `execute` is called" {
                should("be able to print the value '23'") {
                    val expression = FactoryFunction()
                    expression.execute() shouldBe 23
                }
            }
        }
        
    }
}