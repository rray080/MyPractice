package com.example.mypractice

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.RadioButton
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_radio_check.*

class RadioCheckActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_radio_check)

    }

    private fun testRadio(view : View){
        var result = ""
        val java = checkBox1.isChecked
        val python = checkBox2.isChecked
        val android = checkBox3.isChecked
        result = "Java : " + java +"\nPython : "+ python + "\nAndroid : "+android
        Toast.makeText(this,result, Toast.LENGTH_SHORT)

    }

    private fun testCheckBox(view : View){

        val radio:Int = radioGroup.checkedRadioButtonId
        val result = findViewById<RadioButton>(radio).getText().toString();
        Toast.makeText(this,result, Toast.LENGTH_SHORT)
    }
}
