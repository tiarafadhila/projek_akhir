package com.example.tarisa

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class TariRemo : AppCompatActivity() {
    private lateinit var Image_back : ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tari_remo)

        Image_back = findViewById(R.id.button_back44)

        Image_back.setOnClickListener{
            val move = Intent (this@TariRemo, JawaTimur::class.java)
            startActivity(move)
        }
    }
}