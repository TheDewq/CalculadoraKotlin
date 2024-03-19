package com.example.calculadorakotlin

import android.os.Bundle
import android.view.View
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import kotlin.properties.Delegates

class MainActivity : AppCompatActivity() {
    private lateinit var edit_n1:EditText;
    private lateinit var edit_n2:EditText;
    private var n1 by Delegates.notNull<Double>();
    private var n2 by Delegates.notNull<Double>();

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

    }

    fun get_values(){
       edit_n1 = findViewById(R.id.editTextText);
        edit_n2 = findViewById(R.id.editTextText2);
        n1 = edit_n1.text.toString().toDouble();
        n2 = edit_n1.text.toString().toDouble();
        print(n1);
        print(n2);
    }
    fun put_operaciones():List<listOperaciones>{
        var lista:MutableList<listOperaciones> = ArrayList();
        lista.add(listOperaciones("Sumar", mat.suma(n1,n2).toString() ));
        lista.add(listOperaciones("resta", mat.resta(n1,n2).toString() ));
        lista.add(listOperaciones("multiplicacion", mat.multiplicacion(n1,n2).toString() ));
        lista.add(listOperaciones("division", mat.division(n1,n2).toString() ));
        lista.add(listOperaciones("factorial", mat.factorial(n1.toInt()).toString() ));
        lista.add(listOperaciones("figonnachi", mat.fibonacci(n1.toInt()).toString() ));

        return TODO("Provide the return value")
    }







}