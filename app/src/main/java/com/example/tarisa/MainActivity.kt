package com.example.tarisa

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private lateinit var textRegister : TextView
    private lateinit var buttonSignIn : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        textRegister= findViewById(R.id.txtregister)
        buttonSignIn=findViewById(R.id.btn1)

        textRegister.setOnClickListener{
            val move = Intent(this@MainActivity, register::class.java)
            startActivity(move)
        }

        buttonSignIn.setOnClickListener{
            val move = Intent(this@MainActivity, HalamanUtama::class.java)
            startActivity(move)
        }

    }
}
