package com.example.tarisa

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class register : AppCompatActivity() {
    private lateinit var ButtonSignUp : Button
    private lateinit var TextSignIn : TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
        ButtonSignUp=findViewById(R.id.button1)
        TextSignIn=findViewById(R.id.text4)

        ButtonSignUp.setOnClickListener{
            val move = Intent(this@register, login::class.java)
            startActivity(move)
        }

        TextSignIn.setOnClickListener{
            val move = Intent(this@register, login::class.java)
            startActivity(move)
        }
    }
}