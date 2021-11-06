package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    val username = "admin"
    val password = "1234"


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    val button = findViewById<Button>(R.id.loginButton)
        button.setOnClickListener{
            val inputUsername = findViewById<EditText>(R.id.username)
            val inputPassword = findViewById<EditText>(R.id.password)
            val formError = findViewById<TextView>(R.id.errorText)
            if(username == inputUsername.text.toString() && password == inputPassword.text.toString()) {
                formError.visibility = View.INVISIBLE
            }
            else{
                formError.visibility = View.VISIBLE
                formError.text = getString(R.string.loginError)

            }
        }
    }
}