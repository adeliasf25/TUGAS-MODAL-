package com.example.macro

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView


class Kuliner : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kuliner)

        val list = findViewById<RecyclerView>(R.id.kuliner_list)
        list.adapter = kulinerAdapter
    }

    private val kulinerAdapter by lazy {
        val items = listOf<KulinerModel>(
            KulinerModel(R.drawable.kuliner1),
            KulinerModel(R.drawable.kuliner1),
            KulinerModel(R.drawable.kuliner1),
            KulinerModel(R.drawable.kuliner1),
            KulinerModel(R.drawable.kuliner1),
            KulinerModel(R.drawable.kuliner1),
            KulinerModel(R.drawable.kuliner1),
            KulinerModel(R.drawable.kuliner1),
            KulinerModel(R.drawable.kuliner1)
        )

        KulinerAdapter(items, object : KulinerAdapter.AdapterListener{
            override fun onClick(food : KulinerModel) {
                startActivity(Intent(this@Kuliner, KulinerDetail::class.java))
            }

        })
    }
}