package com.example.macro

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction

class ListCardPaketLiburanActivity : AppCompatActivity() {
    // Inside onCreate method of ListCardPaketLiburanActivity
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_card_paket_liburan)

        val kembaliKePaket = findViewById<ImageView>(R.id.kembalikepaket)
        val pesanSekarangButton = findViewById<Button>(R.id.pesansekarang)

        kembaliKePaket.setOnClickListener {

            startActivity(Intent(this, TumpuanActivity::class.java))
        }
        pesanSekarangButton.setOnClickListener {
            startActivity(Intent(this, TumpuanPaketActivity::class.java))
        }
    }
}