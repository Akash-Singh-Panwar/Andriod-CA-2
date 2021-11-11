package com.practice.ui2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.widget.CheckBox
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val cb1 : CheckBox = findViewById<CheckBox>(R.id.cb1)
        val cb2 : CheckBox = findViewById<CheckBox>(R.id.cb2)
        val cb3 : CheckBox = findViewById<CheckBox>(R.id.cb3)
        val cb4 : CheckBox = findViewById<CheckBox>(R.id.cb4)
        val cb5 : CheckBox = findViewById<CheckBox>(R.id.cb5)
        val radg1  : RadioGroup = findViewById<RadioGroup>(R.id.radg1)

        radg1.setOnCheckedChangeListener{group : RadioGroup, checkedId : Int->
            if(checkedId==R.id.rd1){
                val rd1 = findViewById<RadioButton>(R.id.rd1)
                Toast.makeText(this, rd1.text.toString(),Toast.LENGTH_SHORT).show()
            }
            if(checkedId==R.id.rd2){
                val rd2 = findViewById<RadioButton>(R.id.rd2)
                Toast.makeText(this, rd2.text.toString(),Toast.LENGTH_SHORT).show()
            }
            if(checkedId==R.id.rd3){
                val rd3 = findViewById<RadioButton>(R.id.rd3)
                Toast.makeText(this, rd3.text.toString(),Toast.LENGTH_SHORT).show()
            }
        }

        cb1.setOnClickListener{
            if(cb1.isChecked){
                Toast.makeText(this, cb1.text.toString(),Toast.LENGTH_SHORT).show()
            }
        }
        cb2.setOnClickListener{
            if(cb2.isChecked){
                Toast.makeText(this, cb2.text.toString(),Toast.LENGTH_SHORT).show()
            }
        }
        cb3.setOnClickListener{
            if(cb3.isChecked){
                Toast.makeText(this, cb3.text.toString(),Toast.LENGTH_SHORT).show()
            }
        }
        cb4.setOnClickListener{
            if(cb4.isChecked){
                Toast.makeText(this, cb4.text.toString(),Toast.LENGTH_SHORT).show()
            }
        }
        cb5.setOnClickListener{
            if(cb5.isChecked){
                Toast.makeText(this, cb5.text.toString(),Toast.LENGTH_SHORT).show()
            }
        }
    }
}
