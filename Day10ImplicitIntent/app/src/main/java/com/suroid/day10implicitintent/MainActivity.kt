package com.suroid.day10implicitintent

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import androidx.cardview.widget.CardView

abstract class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // By using its id we are using
        val webButton = findViewById<CardView>(R.id.cardweb)
        val cameraButton = findViewById<CardView>(R.id.cardCamera)

        // when we click on "webButton" what action does perform
        webButton.setOnClickListener{
            // whatever the data i show that will display to user
            val intent = Intent(Intent.ACTION_VIEW)
            // Here what we are viewing
            intent.data= Uri.parse("https://github.com/SurajScoe")
            startActivity(intent)
        }
        // when we click on "cameraButton" what action does perform
        cameraButton.setOnClickListener{
            val intent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
            startActivity(intent)
        }
    }
}