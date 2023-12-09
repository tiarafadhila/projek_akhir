package com.example.tarisa

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class TariZapin : AppCompatActivity() {
    private lateinit var Image_back : ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tari_zapin)

        Image_back = findViewById(R.id.button_back22)

        Image_back.setOnClickListener{
            val move = Intent (this@TariZapin, Riau::class.java)
            startActivity(move)
        }
    }
}