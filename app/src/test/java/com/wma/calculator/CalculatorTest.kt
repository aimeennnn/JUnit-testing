package com.wma.calculator

import org.junit.Test
import kotlin.test.assertEquals

class CalculatorTest {
    @Test
    fun test() {
        val calculator = Calculator()
        val result = calculator.add(3, 5)
        assertEquals(8, result, "Berhasil")
    }
}
