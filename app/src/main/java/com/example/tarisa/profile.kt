package com.example.tarisa

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class profile : AppCompatActivity() {
    private lateinit var Button_edit : Button
    private lateinit var Button_logout : Button
    private lateinit var Image_kategori : ImageView
    private lateinit var Image_home : ImageView
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        Button_edit = findViewById(R.id.edit_profile)
        Button_logout = findViewById(R.id.logout)
        Image_home = findViewById(R.id.home_button1)
        Image_kategori = findViewById(R.id.kategori_button1)

        Button_edit.setOnClickListener{
            val move = Intent (this@profile, edit_profile::class.java)
            startActivity(move)
        }

        Button_logout.setOnClickListener{
            val move = Intent (this@profile, login::class.java)
            startActivity(move)
        }

        Image_home.setOnClickListener{
            val move = Intent (this@profile, HalamanUtama::class.java)
            startActivity(move)
        }

        Image_kategori.setOnClickListener{
            val move = Intent (this@profile, kategori::class.java)
            startActivity(move)
        }
    }
}