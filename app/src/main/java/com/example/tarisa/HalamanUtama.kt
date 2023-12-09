package com.example.tarisa

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class HalamanUtama : AppCompatActivity() {
    private lateinit var ImageProfile : ImageView
    private lateinit var ImageKategori : ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_halaman_utama)

        ImageProfile = findViewById(R.id.profile_button)
        ImageKategori = findViewById(R.id.kategori_button)

        ImageProfile.setOnClickListener{
            val move = Intent(this@HalamanUtama, profile::class.java)
            startActivity(move)
        }

        ImageKategori.setOnClickListener{
            val move = Intent(this@HalamanUtama, kategori::class.java)
            startActivity(move)
        }
    }
}