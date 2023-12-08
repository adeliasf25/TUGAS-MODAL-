package com.example.macro

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SuccesActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_succes)
        val share = findViewById<Button>(R.id.share)
        val batal = findViewById<Button>(R.id.selesai)

        batal.setOnClickListener {

            startActivity(Intent(this, TumpuanActivity::class.java))
        }
        share.setOnClickListener {
            startActivity(Intent(this, TumpuanActivity::class.java))
        }
    }
}