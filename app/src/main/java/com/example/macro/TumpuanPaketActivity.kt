package com.example.macro

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class TumpuanPaketActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tumpuan_paket)
        val kembaliKePaket1 = findViewById<ImageView>(R.id.back)
        val pesanSekarangButton1 = findViewById<Button>(R.id.pesansekarang1)
        val intenary = findViewById<TextView>(R.id.intenary)

        kembaliKePaket1.setOnClickListener {

            startActivity(Intent(this, ListCardPaketLiburanActivity::class.java))
        }
        pesanSekarangButton1.setOnClickListener {
            startActivity(Intent(this, PembayaranActivity::class.java))
        }
        intenary.setOnClickListener {
            startActivity(Intent(this, TumpuanPaketActivity2::class.java))
        }
    }
}