package com.example.tarisa

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class Riau : AppCompatActivity() {
    private lateinit var Image_back : ImageView
    private lateinit var Button_persembahan : Button
    private lateinit var Button_zapin : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_riau)

        Image_back = findViewById(R.id.back_button1)
        Button_persembahan = findViewById(R.id.tari_persembahan)
        Button_zapin = findViewById(R.id.tari_zapin)

        Image_back.setOnClickListener{
            val move = Intent (this@Riau, kategori::class.java)
            startActivity(move)
        }

        Button_persembahan.setOnClickListener{
            val move = Intent (this@Riau, TariPersembahan::class.java)
            startActivity(move)
        }

        Button_zapin.setOnClickListener{
            val move = Intent (this@Riau, TariZapin::class.java)
            startActivity(move)
        }
    }
}