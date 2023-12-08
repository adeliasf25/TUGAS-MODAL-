package com.example.macro
import android.media.Image
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import  androidx.recyclerview.widget.RecyclerView


class AdptOnboarding(private val onboardingItem : List<OnboardingMacro>) :
    RecyclerView.Adapter<AdptOnboarding.OnboardingItemViewHolder>() {

    inner class OnboardingItemViewHolder(view : View) :RecyclerView.ViewHolder(view){
        private val imageOnboarding = view.findViewById<ImageView>(R.id.imageOn)
        private val textTittle = view.findViewById<TextView>(R.id.judul)
        private val textDescription = view.findViewById<TextView>(R.id.desk)

        fun bin(onboardingItem :OnboardingMacro){
            imageOnboarding.setBackgroundResource(onboardingItem.image)
            textTittle.text = onboardingItem.judul
            textDescription.text =onboardingItem.desk
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): OnboardingItemViewHolder {
        return OnboardingItemViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.tittle_on_boarding,
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: OnboardingItemViewHolder, position: Int) {
        holder.bin(onboardingItem[position])
    }

    override fun getItemCount(): Int {
        return onboardingItem.size
    }
}
