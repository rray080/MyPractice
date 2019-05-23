package com.example.mypractice

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_dice_roller.*
import kotlin.random.Random

class DiceRollerActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dice_roller)

        btnRoll.setOnClickListener {
            rollDice()
        }
    }

    private fun rollDice(){
        Toast.makeText(this, "Roll Button Clicked", Toast.LENGTH_SHORT).show()
        txtRollHeader.text = getString(R.string.rollTextView)

        btnRoll.setEnabled(false)
        Thread.sleep(5000)
        btnRoll.setEnabled(true)

        val randomInt = Random.nextInt(6)
        txtRollHeader.text = randomInt.toString()
    }

}
