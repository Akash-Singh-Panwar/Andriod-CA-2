package com.practice.ui1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btn1 = findViewById<Button>(R.id.btn1)
        btn1.setOnClickListener{
            println("button 1 pressed")
        }
        val btn2 = findViewById<Button>(R.id.btn2)
        btn2.setOnClickListener{
            println("button 2 pressed")
        }
        val btn3 = findViewById<Button>(R.id.btn3)
        btn3.setOnClickListener{
            println("button 3 pressed")
        }
    }
}
