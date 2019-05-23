package com.example.mypractice

import android.content.Intent
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

        //call for ArithmeticActivity
        btnArithmeticActivity.setOnClickListener { lunchArithmeticActivity() }
    }

    fun toastMe(view: View){
        val toastVal = Toast.makeText(this, "Clicked : ${txtWelcome.text}", Toast.LENGTH_SHORT)
        toastVal.show()
    }

    fun countUp(view: View){
        var count: Int = txtCount.text.toString().toInt()
        count++
        txtCount.setText (count.toString())
    }

    fun luncherDiceRoller(view: View){
        Log.d("MainActivity", "Dice Roller Button Clicked")
        val intent = Intent(this, DiceRollerActivity::class.java)
        startActivity(intent)
    }

    private fun lunchArithmeticActivity(){
        Log.d("MainActivity", "Arithmetic Activity Button Clicked")
        startActivity(Intent(this, ArithmeticActivity::class.java))
    }
}
