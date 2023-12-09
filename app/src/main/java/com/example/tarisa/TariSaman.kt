package com.example.tarisa

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class TariSaman : AppCompatActivity() {
    private lateinit var Image_back : ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tari_saman)

        Image_back = findViewById(R.id.button_back5)

        Image_back.setOnClickListener{
            val move = Intent (this@TariSaman, Aceh::class.java)
            startActivity(move)
        }
    }
}