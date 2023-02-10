package com.example.calculator_v1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.button_one)
        val text = findViewById<TextView>(R.id.textView)
        button.setOnClickListener {
            fun onClick() {
                text.text = "I changed!"
            }
        }

        //This is my first change for a practice commit
    }
}