package com.example.pass_data_from_s1_to_s2_day_07

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    // creating KEY
    companion object{
        const val KEY = "com.example.pass_data_from_s1_to_s2_day_07.MainActivity.KEY"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnOrder.setOnClickListener{
            val orderPlace = et1.text.toString() + " " + et2.text.toString() + " "+
                   et3.text.toString() + " " + et4.text.toString()
            // Where we want to go "this" is used
            intent= Intent(this,Showorder::class.java)
            //some more information
            intent.putExtra(KEY,orderPlace)
            startActivity(intent)
        }
    }
}