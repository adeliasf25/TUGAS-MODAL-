package com.example.macro

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class TumpuanPaketActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tumpuan_paket2)
        val kembaliKePaket1 = findViewById<ImageView>(R.id.kembalikepaket1)
        val pesanSekarangButton1 = findViewById<Button>(R.id.bayarr)
        val intenary = findViewById<TextView>(R.id.tempat)

        kembaliKePaket1.setOnClickListener {

            startActivity(Intent(this, ListCardPaketLiburanActivity::class.java))
        }
        pesanSekarangButton1.setOnClickListener {
            startActivity(Intent(this, PembayaranActivity::class.java))
        }
        intenary.setOnClickListener {
            startActivity(Intent(this, TumpuanPaketActivity::class.java))
        }
    }
}