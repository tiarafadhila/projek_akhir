package com.example.tarisa

import android.content.Intent
import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class JawaTimur : AppCompatActivity() {
    private lateinit var Image_back : ImageView
    private lateinit var Button_reog : Button
    private lateinit var Button_remo : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_jawa_timur)

        Image_back = findViewById(R.id.back_button3)
        Button_reog = findViewById(R.id.tari_reog)
        Button_remo = findViewById(R.id.tari_remo)

        Image_back.setOnClickListener{
            val move = Intent (this@JawaTimur, kategori::class.java)
            startActivity(move)
        }

        Button_reog.setOnClickListener{
            val move = Intent (this@JawaTimur, TariReogPonorogo::class.java)
            startActivity(move)
        }

        Button_remo.setOnClickListener{
            val move = Intent (this@JawaTimur, TariRemo::class.java)
            startActivity(move)
        }
    }
}