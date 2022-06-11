package com.example.my_login_app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    lateinit var btnsignup : Button
    lateinit var btnGoogle : Button
    lateinit var btnFacebook:  Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnsignup = findViewById(R.id.btnsignup)
        btnGoogle = findViewById(R.id.btnGoogle)
        btnFacebook = findViewById(R.id.btnFacebook)


        btnsignup.setOnClickListener{
           val intent = Intent(this,SigninActivity::class.java)
            startActivity(intent)
        }
        btnGoogle.setOnClickListener{
            val intent = Intent(this,GoogleActivity::class.java)
            startActivity(intent)
        }
        btnFacebook.setOnClickListener{
            val intent = Intent(this,FacebookActivity::class.java)
            startActivity(intent)
        }
    }
}