package com.example.tarisa

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class TariJaipong : AppCompatActivity() {
    private lateinit var Image_back : ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tari_jaipong)

        Image_back = findViewById(R.id.button_back3)

        Image_back.setOnClickListener{
            val move = Intent (this@TariJaipong, JawaBarat::class.java)
            startActivity(move)
        }
    }
}