package com.example.intents_day_04

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnIntenet = findViewById<Button>(R.id.button)
        btnIntenet.setOnClickListener{
            //open new activity

            intent = Intent(applicationContext, SecondActivity::class.java)
            startActivity(intent)
        }
    }
}