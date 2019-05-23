package com.example.mypractice

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d("MainActivity", "Hello World")
    }

    fun toastMe(view: View){
        val toastVal = Toast.makeText(this, "Clicked : ${txtWelcome.text}", Toast.LENGTH_SHORT)
        toastVal.show()
    }

    fun countUp(view: View){
        var count: Int = Integer.parseInt(txtCount.text.toString())
        count++
        txtCount.setText (count.toString())
    }
}
