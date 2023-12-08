package com.example.macro

import android.annotation.SuppressLint
import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.fragment.app.Fragment
import com.example.macro.databinding.ActivityKulinerDetailBinding

class KulinerDetail : AppCompatActivity() {
    lateinit var binding : ActivityKulinerDetailBinding

    @SuppressLint("ResourceAsColor")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityKulinerDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.backbtnKulinerDetail.setOnClickListener {
            startActivity(Intent(this@KulinerDetail, Kuliner::class.java))
        }
        binding.overviewBtn.setTextColor(Color.parseColor("#FFD600"))

        binding.overviewBtn.setOnClickListener {
            replaceFragment(KulinerOverview())
            binding.overviewBtn.setTextColor(Color.parseColor("#FFD600"))
            binding.ingredientsBtn.setTextColor(Color.parseColor("#FFFFFF"))
        }

        binding.ingredientsBtn.setOnClickListener {
            replaceFragment(KulinerIngredients())
            binding.ingredientsBtn.setTextColor(Color.parseColor("#FFD600"))
            binding.overviewBtn.setTextColor(Color.parseColor("#FFFFFF"))
        }
    }

    private fun replaceFragment(fragment : Fragment){
        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()

        fragmentTransaction.replace(R.id.fragmentContainerView2, fragment)
        fragmentTransaction.commit()
    }
}