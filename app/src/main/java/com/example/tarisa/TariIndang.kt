package com.example.tarisa

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class TariIndang : AppCompatActivity() {
    private lateinit var Button_back : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tari_indang)

        Button_back = findViewById(R.id.button_back11)

        Button_back.setOnClickListener{
            val move = Intent (this@TariIndang, SumateraBarat::class.java)
            startActivity(move)
        }
    }
}