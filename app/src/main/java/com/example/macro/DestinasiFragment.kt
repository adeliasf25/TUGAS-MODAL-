package com.example.macro

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class DestinasiFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_destinasi, container, false)

        // Initialize RecyclerView
        val recyclerView: RecyclerView = view.findViewById(R.id.recyclerview)
        recyclerView.layoutManager = LinearLayoutManager(activity)

        // Set up dummy data for Destinasi
        val destinasiList = listOf(
            Destinasi(R.drawable.destinasi1, "Destinasi 1", "Deskripsi Destinasi 1", R.drawable.like, R.drawable.star, "4.5"),
            Destinasi(R.drawable.destinasi1, "Destinasi 2", "Deskripsi Destinasi 2", R.drawable.like, R.drawable.star, "4.8"),
            // Add other destinations
        )

        // Set up RecyclerView adapter
        val adapter = AdptDestinasi(destinasiList)
        recyclerView.adapter = adapter

        return view
    }
}
