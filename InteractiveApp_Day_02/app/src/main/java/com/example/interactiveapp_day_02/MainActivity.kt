package com.example.interactiveapp_day_02

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonGreen = findViewById<Button>(R.id.btnGreen)
        val buttonRead = findViewById<Button>(R.id.btnRead)
        val layout = findViewById<LinearLayout>(R.id.LinearLayout)

        buttonRead.setOnClickListener{
            // change to light mode
            layout.setBackgroundResource(R.color.yellow)
        }
        buttonGreen.setOnClickListener{
            // change to Dark mode
            layout.setBackgroundResource(R.color.green)
        }


    }
}