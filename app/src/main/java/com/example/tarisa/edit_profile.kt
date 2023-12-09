package com.example.tarisa

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class edit_profile : AppCompatActivity() {
    private lateinit var Button_savechanges : Button
    @SuppressLint("Missing Inflate Id")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit_profile)

        Button_savechanges = findViewById(R.id.save_button)

        Button_savechanges.setOnClickListener{
            val move = Intent(this@edit_profile, profile::class.java)
            startActivity(move)
        }
    }
}