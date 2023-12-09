package com.example.tarisa

import android.content.Intent
import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager.BadTokenException
import android.widget.Button
import android.widget.ImageView

class Aceh : AppCompatActivity() {
    private lateinit var Image_back : ImageView
    private lateinit var Button_saman : Button
    private lateinit var Button_seudati : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_aceh)

        Image_back = findViewById(R.id.back_button4)
        Button_saman = findViewById(R.id.tari_saman)
        Button_seudati = findViewById(R.id.tari_seudati)

        Image_back.setOnClickListener{
            val move = Intent (this@Aceh, kategori::class.java)
            startActivity(move)
        }

        Button_saman.setOnClickListener{
            val move = Intent (this@Aceh, TariSaman::class.java)
            startActivity(move)
        }

        Button_seudati.setOnClickListener{
            val move = Intent (this@Aceh, TariSeudati::class.java)
            startActivity(move)
        }
    }
}