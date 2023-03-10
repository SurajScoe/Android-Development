package com.example.database_day_09

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.google.android.material.textfield.TextInputEditText
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase

// lateint keyword stands for late initialization
//When used with a class property, the lateinit modifier
//keeps the property from being initialized at the time of its
//class' object construction.

class MainActivity : AppCompatActivity() {
    // variable database and its type is DatabaseReference
    // lateint means we will initialize is later
    lateinit var database : DatabaseReference
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val signButton = findViewById<Button>(R.id.btnSignUp)
        val etName = findViewById<TextInputEditText>(R.id.etName)
        val etMail = findViewById<TextInputEditText>(R.id.etMail)
        val userId = findViewById<TextInputEditText>(R.id.etUserName)
        val userPassword = findViewById<TextInputEditText>(R.id.etPassword)

        signButton.setOnClickListener{
            //we will get data that user entered
            // what user entered we will get that data here
            val name = etName.text.toString()
            val mail = etMail.text.toString()
            val userid = userId.text.toString()
            val password = userPassword.text.toString()


            // here we will create object "user"
            val user = User(name,mail,password,userid)
            //Here we initialize database
            //get
            database = FirebaseDatabase.getInstance().getReference("Users")

            //Now here we will entre the data to database
            // so we will make child
            // and set the value
            database.child(userid).setValue(user).addOnSuccessListener {
                //if its successful then its will show below line otherwise go for next one
                etName.text?.clear()
                Toast.makeText(this, "User Register", Toast.LENGTH_SHORT).show()
            }.addOnFailureListener {
                Toast.makeText(this,"Failed",Toast.LENGTH_SHORT).show()
            }


            }
            val signIntText = findViewById<TextView>(R.id.tvSignIN)
            signIntText.setOnClickListener{
                val openSignInActivity = Intent(this, SignInActivity::class.java)
                startActivity(openSignInActivity)
            }
        }
    }