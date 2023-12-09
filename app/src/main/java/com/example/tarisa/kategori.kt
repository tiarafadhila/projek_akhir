package com.example.tarisa

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class kategori : AppCompatActivity() {
    private lateinit var Image_profile : ImageView
    private lateinit var Image_home : ImageView
    private lateinit var Button_sumbar : Button
    private lateinit var Button_riau : Button
    private lateinit var Button_jabar : Button
    private lateinit var Button_jatim : Button
    private lateinit var Button_aceh : Button
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kategori)

        Image_profile = findViewById(R.id.profile_button2)
        Image_home = findViewById(R.id.home_button2)
        Button_sumbar = findViewById(R.id.tari_sumbar)
        Button_riau = findViewById(R.id.tari_riau)
        Button_jabar = findViewById(R.id.tari_jabar)
        Button_jatim = findViewById(R.id.tari_jatim)
        Button_aceh = findViewById(R.id.tari_aceh)

        Image_profile.setOnClickListener{
            val move = Intent (this@kategori, profile::class.java)
            startActivity(move)
        }

        Image_home.setOnClickListener{
            val move = Intent (this@kategori, HalamanUtama::class.java)
            startActivity(move)
        }

        Button_sumbar.setOnClickListener{
            val move = Intent (this@kategori, SumateraBarat::class.java)
            startActivity(move)
        }

        Button_riau.setOnClickListener{
            val move = Intent (this@kategori, Riau::class.java)
            startActivity(move)
        }

        Button_jabar.setOnClickListener{
            val move = Intent (this@kategori, JawaBarat::class.java)
            startActivity(move)
        }

        Button_jatim.setOnClickListener{
            val move = Intent (this@kategori, JawaTimur::class.java)
            startActivity(move)
        }

        Button_aceh.setOnClickListener{
            val move = Intent (this@kategori, Aceh::class.java)
            startActivity(move)
        }
    }
}