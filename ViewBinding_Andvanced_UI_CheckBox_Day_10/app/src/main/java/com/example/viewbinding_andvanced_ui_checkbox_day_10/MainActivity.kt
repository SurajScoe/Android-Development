package com.example.viewbinding_andvanced_ui_checkbox_day_10

import android.content.res.ColorStateList
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.viewbinding_andvanced_ui_checkbox_day_10.databinding.ActivityMainBinding


//Things learned Today:
//1. Use of View Bindings
//2. CheckBoxes
//3. Prompt the user to check the checkbox and proceed only if the user has checked the checkbox
//4. Making UI more attractive
class MainActivity : AppCompatActivity() {
    // varibale = class
    lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // initialize the variable
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button.setOnClickListener{
            if(binding.checkBox.isChecked){
                // Open a New Screen
            } else{
                binding.checkBox.buttonTintList = ColorStateList.valueOf(Color.RED)
                Toast.makeText(this,"Please accept the T&C",Toast.LENGTH_SHORT).show()
            }
        }

    }
}