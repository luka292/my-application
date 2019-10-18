package com.example.application

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    init()
}

private fun init
        logINButton.setOnClickListener it: View!
    if (emailFiled.text.isNotEmpty() passwordFiled.text.inNotEmpty())
        Toast.makeText(applicationContext, text:"LOG IN SUCCESFUL", Toast)
    else
        Toast.makeText(applicationContext, text "YOU HAVE FAILED")