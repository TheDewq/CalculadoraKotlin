package com.example.calculadorakotlin

import android.widget.EditText
import org.junit.Assert.*
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import kotlin.properties.Delegates


class MainActivityTest {
    private var main:MainActivity? = null
    private var v1 by Delegates.notNull<Int>()
    private var v2 by Delegates.notNull<Int>()

    @Before
    fun onBefore(){
        var n1:EditText = main!!.findViewById(R.id.editTextText)
        var n2:EditText = main!!.findViewById(R.id.editTextText)
        n1.setText("2");
        n2.setText("")
        v1 = n1.text.toString().toInt()
        v2 = n2.text.toString().toInt()

    }
    @Test
    fun onCreate() {
        println("${main} si ve?")
    }
}