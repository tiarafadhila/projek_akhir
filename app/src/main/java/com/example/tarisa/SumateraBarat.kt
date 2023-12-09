package com.example.tarisa

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class SumateraBarat : AppCompatActivity() {
    private lateinit var Image_back : ImageView
    private lateinit var Button_piring : Button
    private lateinit var Button_indang : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sumatera_barat)

        Image_back = findViewById(R.id.back_button)
        Button_piring = findViewById(R.id.tari_piring)
        Button_indang = findViewById(R.id.tari_indang)

        Image_back.setOnClickListener{
            val move = Intent (this@SumateraBarat, kategori::class.java)
            startActivity(move)
        }

        Button_piring.setOnClickListener{
            val move = Intent (this@SumateraBarat, TariPiring::class.java)
            startActivity(move)
        }

        Button_indang.setOnClickListener{
            val move = Intent (this@SumateraBarat, TariIndang::class.java)
            startActivity(move)
        }
    }
}