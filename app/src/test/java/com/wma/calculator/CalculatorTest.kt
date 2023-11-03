package com.wma.calculator

import org.junit.Test
import kotlin.test.assertEquals

class CalculatorTest {
    @Test // Ini adalah anotasi yang menandakan metode berikutnya adalah metode pengujian.
    fun test() {   // Ini adalah metode pengujian utama.
        val calculator = Calculator()  // Membuat instance dari kelas Calculator.
        val result = calculator.add(3, 5)  // Memanggil metode add() untuk menghitung hasil.
        assertEquals(8, result, "Berhasil")   // Memeriksa apakah hasil sesuai dengan yang diharapkan.
    }
}
