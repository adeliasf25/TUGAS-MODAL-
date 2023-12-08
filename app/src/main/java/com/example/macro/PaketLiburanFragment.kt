package com.example.macro

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.cardview.widget.CardView

class PaketLiburanFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_paket_liburan, container, false)

        val cardRecyclerView: CardView = view.findViewById(R.id.recyclerview)
        cardRecyclerView.setOnClickListener {
            // Panggil metode atau lakukan tindakan ketika card di klik
            // Misalnya, memulai aktivitas baru
            startActivity(Intent(requireContext(), ListCardPaketLiburanActivity::class.java))
        }

        // ... (kode lainnya)

        return view
    }
}
