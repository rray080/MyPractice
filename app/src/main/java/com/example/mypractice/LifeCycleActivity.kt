package com.example.mypractice

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class LifeCycleActivity : AppCompatActivity() {

    private var MY_TAG: String = "My_Custom_Message"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_life_cycle)
        Log.i(MY_TAG, "onCreate Method")
    }

    override fun onStart() {
        super.onStart()
        Log.i(MY_TAG, "onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.i(MY_TAG, "onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.i(MY_TAG, "onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.i(MY_TAG, "onStop")
    }

    override fun onRestart() {
        super.onRestart()
        Log.i(MY_TAG, "onRestart")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i(MY_TAG, "onDestroy")
    }
}
