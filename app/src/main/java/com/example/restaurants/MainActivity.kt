package com.example.restaurants

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.textfield.TextInputLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val loginButton = findViewById<Button>(R.id.btn_login)
        loginButton.setOnClickListener {
            checkLogin()
        }

        val googleButton = findViewById<Button>(R.id.btn_google)
        googleButton.setOnClickListener {
            val url = "https://www.google.com"
            val implicitGoogleIntent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
            startActivity(implicitGoogleIntent)

        }

    }

    fun checkLogin(){
        val emailEditText = findViewById<EditText>(R.id.txt_email)
        val email = emailEditText.text.toString()

        val passwordEditText = findViewById<EditText>(R.id.txt_password)
        val password = passwordEditText.text.toString()

        val emailInputLayout = findViewById<TextInputLayout>(R.id.emailInputLayout)

        if(email.length == 0){
            //email is empty -> display error
            emailInputLayout.error ="Email cannot be empty"
        }else{
            if(email == "test@gmail.com" && password == "1234"){
                Toast.makeText(applicationContext, "Login ok", Toast.LENGTH_LONG).show()
                val navigateToHomeScreen = Intent(this, HomeScreenActivity::class.java)
                startActivity(navigateToHomeScreen)
            }else{
                Toast.makeText(applicationContext, "Invalid login", Toast.LENGTH_LONG).show()
            }
        }

    }
}