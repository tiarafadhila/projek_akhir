package com.example.tarisa

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class login : AppCompatActivity() {
    private lateinit var Button_login: Button
    private lateinit var Text_signup : TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        Button_login = findViewById(R.id.btn1)
        Text_signup = findViewById(R.id.txtregister)

        Button_login.setOnClickListener {
            val move = Intent(this@login, HalamanUtama::class.java)
            startActivity(move)
        }

        Text_signup.setOnClickListener{
            val move = Intent (this@login, register::class.java)
            startActivity(move)
        }
    }
}