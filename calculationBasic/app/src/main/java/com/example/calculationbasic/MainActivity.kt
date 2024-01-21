package com.example.calculationbasic

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() , View.OnClickListener {

    lateinit var btnAdd : Button
    lateinit var btnSub : Button
    lateinit var btnMultiply : Button
    lateinit var btnDiv : Button
    lateinit var etA : EditText
    lateinit var etB : EditText
    lateinit var tvResult : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnAdd = findViewById(R.id.btn_add)
        btnSub = findViewById(R.id.btn_subtraction)
        btnMultiply = findViewById(R.id.btn_multiply)
        btnDiv = findViewById(R.id.btn_division)
        etA = findViewById(R.id.etA)
        etB = findViewById(R.id.etB)
        tvResult = findViewById(R.id.tvResult)

        btnAdd.setOnClickListener(this)
        btnSub.setOnClickListener(this)
        btnMultiply.setOnClickListener(this)
        btnDiv.setOnClickListener(this)

    }

    override fun onClick(v: View?) {

        var a = etA.text.toString().toDouble()
        var b = etB.text.toString().toDouble()
        var result = 0.0

        when(v?.id){
            R.id.btn_add -> {
                result = a+b
            }
            R.id.btn_subtraction -> {
                result = a-b
            }
            R.id.btn_multiply -> {
                result = a*b
            }
            R.id.btn_division -> {
                result = a/b
            }
        }
        tvResult.text = "Result is $result"
    }
}