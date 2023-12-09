package com.example.tarisa

import android.content.Intent
import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class TariReogPonorogo : AppCompatActivity() {
    private lateinit var Image_back : ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tari_reog_ponorogo)

        Image_back = findViewById(R.id.button_back4)

        Image_back.setOnClickListener{
            val move = Intent (this@TariReogPonorogo, JawaTimur::class.java)
            startActivity(move)
        }
    }
}