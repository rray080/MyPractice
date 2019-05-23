package com.example.mypractice

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_arithmetic.*

class ArithmeticActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_arithmetic)

        btnAdd.setOnClickListener {
            lblResult.text = add()
        }

        btnSub.setOnClickListener {
            lblResult.text = sub()
        }

        btnMul.setOnClickListener {
            lblResult.text = mul()
        }

        btnDiv.setOnClickListener {
            lblResult.text = div(it)
        }
    }

    private fun add(): String{
        val num1 = txtNum1.text.toString().toInt()
        val num2 = txtNum2.text.toString().toInt()

        return (num1 + num2).toString()
    }

    private fun sub(): String{
        val num1 = txtNum1.text.toString().toInt()
        val num2 = txtNum2.text.toString().toInt()

        return (num1 - num2).toString()
    }

    private fun mul(): String{
        val num1 = txtNum1.text.toString().toInt()
        val num2 = txtNum2.text.toString().toInt()

        return (num1 * num2).toString()
    }

    private fun div(view: View): String{
        val num1 = txtNum1.text.toString().toInt()
        val num2 = txtNum2.text.toString().toInt()

        return (num1 / num2).toString()
    }
}
