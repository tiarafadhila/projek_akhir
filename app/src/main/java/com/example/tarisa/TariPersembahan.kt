package com.example.tarisa

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class TariPersembahan : AppCompatActivity() {
    private lateinit var Image_back : ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tari_persembahan)

        Image_back = findViewById(R.id.button_back2)

        Image_back.setOnClickListener {
            val move = Intent(this@TariPersembahan, Riau::class.java)
            startActivity(move)
        }
    }
}