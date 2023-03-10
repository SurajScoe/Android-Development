 package com.example.splash_screen_day_08

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

 class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // if supportActionBar is "Null" then its not call hide method "?." indicates condition
        supportActionBar?.hide()
        //So this acActivity is for short time we want another activity

        Handler().postDelayed({
                val intent = Intent(this,SignUp::class.java)
            startActivity(intent)
            finish()
            },3000)

    }
}