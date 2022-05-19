package com.example.calc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var btnAdd: Button
    lateinit var btnSubtract: Button
    lateinit var btnMultiply: Button
    lateinit var btnModulus: Button
    lateinit var tvResult: TextView
    lateinit var etNumber1: EditText
    lateinit var etNumber2: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnAdd = findViewById(R.id.btnAdd)
        btnSubtract = findViewById(R.id.btnSubtract)
        btnMultiply = findViewById(R.id.btnMultiply)
        btnModulus = findViewById(R.id.btnModulus)
        etNumber1 = findViewById(R.id.etNumber1)
        etNumber2 = findViewById(R.id.etNumber2)
        tvResult = findViewById(R.id.tvResult)


        btnAdd.setOnClickListener {
            val num1 = etNumber1.text.toString().toInt()
            val num2 = etNumber2.text.toString().toInt()
            addition(num1, num2)
        }
        btnSubtract.setOnClickListener {
            val num1 = etNumber1.text.toString().toInt()
            val num2 = etNumber2.text.toString().toInt()
            subtraction(num1, num2)
        }
        btnMultiply.setOnClickListener {
            val num1 = etNumber1.text.toString().toInt()
            val num2 = etNumber2.text.toString().toInt()
            multiplication(num1, num2)
        }
        btnModulus.setOnClickListener {
            val num1 = etNumber1.text.toString().toInt()
            val num2 = etNumber2.text.toString().toInt()
            modulus(num1, num2)
        }
    }

    fun addition(num1: Int, num2: Int) {
        val add = num1 + num2
        tvResult.text = add.toString()
    }

    fun subtraction(num1: Int, num2: Int) {
        val subtract = num1 - num2
        tvResult.text = subtract.toString()
    }

    fun multiplication(num1: Int, num2: Int) {
        val multiply = num1 * num2
        tvResult.text = multiply.toString()
    }

    fun modulus(num1: Int, num2: Int) {
        val remainder = num1 % num2
        tvResult.text = remainder.toString()
    }

}
