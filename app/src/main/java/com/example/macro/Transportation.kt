package com.example.macro

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class Transportation : AppCompatActivity() {
    lateinit var btnCard : ImageView

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_transportation)
        btnCard = findViewById(R.id.trans_card)

        btnCard.setOnClickListener{
            startActivity(Intent(this@Transportation, TransportDetail::class.java))
        }
    }
}