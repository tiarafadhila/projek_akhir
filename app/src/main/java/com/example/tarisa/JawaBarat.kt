package com.example.tarisa

import android.content.Intent
import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class JawaBarat : AppCompatActivity() {
    private lateinit var Image_back : ImageView
    private lateinit var Button_jaipong : Button
    private lateinit var Button_kuncaran : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_jawa_barat)

        Image_back = findViewById(R.id.back_button2)
        Button_jaipong = findViewById(R.id.tari_jaipong)
        Button_kuncaran = findViewById(R.id.tari_kuncaran)

        Image_back.setOnClickListener{
            val move = Intent (this@JawaBarat, kategori::class.java)
            startActivity(move)
        }

        Button_jaipong.setOnClickListener{
            val move = Intent (this@JawaBarat, TariJaipong::class.java)
            startActivity(move)
        }

        Button_kuncaran.setOnClickListener{
            val move = Intent (this@JawaBarat, TariTopengKuncaran::class.java)
            startActivity(move)
        }
    }
}