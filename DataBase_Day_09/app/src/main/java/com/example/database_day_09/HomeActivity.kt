package com.example.database_day_09

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        //Here we will get values from signIn activity to this activity
        val name = intent.getStringExtra(SignInActivity.KEY2)
        val mail = intent.getStringExtra(SignInActivity.KEY1)
        val userid = intent.getStringExtra(SignInActivity.KEY3)

        val welcomeText = findViewById<TextView>(R.id.tvWelcome)
        val mailText = findViewById<TextView>(R.id.tvWelcome)
        val idText = findViewById<TextView>(R.id.tvWelcome)

        welcomeText.text = "Welcome$name"
        mailText.text = "Mail : $mail"
        idText.text = "UserId : $userid"
    }
}