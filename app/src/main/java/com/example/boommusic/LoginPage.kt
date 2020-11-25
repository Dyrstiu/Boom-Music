package com.example.boommusic

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class LoginPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_page)
        val LoginButton : Button = findViewById(R.id.loginButton)
        LoginButton.setOnClickListener{
                val toast = Toast.makeText(this,"Button Clicked!",Toast.LENGTH_SHORT)
                toast.show()
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()

            }
    }
    //passwordLayout.error = getString(R.string.error)
}