package com.example.calculadorakotlin;

import junit.framework.TestCase;

class matTest : TestCase() {
    private val n1:Double = 2.toDouble()
    private val n2:Double= 3.toDouble()

    fun testSuma() {
        assertEquals(5.0, mat.suma(n1, n2))
    }

    fun testResta() {
        assertEquals(-1.0, mat.resta(n1, n2))
    }

    fun testMultiplicacion() {
        assertEquals(6.0, mat.multiplicacion(n1, n2))
    }

    fun testDivision() {
        assertEquals(0.6667, mat.division(n1, n2))
    }

    fun testFactorial() {
        assertEquals(2, mat.factorial(n1.toInt()))
    }
}