package com.example.pass_data_from_s1_to_s2_day_07

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_showorder.*

class Showorder : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_showorder)

        val ordersOfCustomer= intent.getStringArrayExtra(MainActivity.KEY)

        tvOrder.text= ordersOfCustomer.toString()
    }
}