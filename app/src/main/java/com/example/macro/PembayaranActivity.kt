package com.example.macro

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class PembayaranActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pembayaran)
        val pesanSekarangButton2 = findViewById<Button>(R.id.bayar)
        val batal = findViewById<Button>(R.id.batal)

        batal.setOnClickListener {

            startActivity(Intent(this, ListCardPaketLiburanActivity::class.java))
        }
        pesanSekarangButton2.setOnClickListener {
            startActivity(Intent(this, SuccesActivity::class.java))
        }
    }
}