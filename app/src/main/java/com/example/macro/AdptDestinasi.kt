package com.example.macro

import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import android.view.LayoutInflater


class AdptDestinasi(private val destinasi: List<Destinasi>) :
    RecyclerView.Adapter<AdptDestinasi.DestinasiViewHolder>() {

    class DestinasiViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        private val listGambar = view.findViewById<ImageView>(R.id.imagedes)
        private val heading = view.findViewById<TextView>(R.id.heading)
        private val deskDes = view.findViewById<TextView>(R.id.textdes)
        private val star = view.findViewById<ImageView>(R.id.star)
        private val rate = view.findViewById<TextView>(R.id.ratting)
        private val like = view.findViewById<ImageView>(R.id.imglike)

        fun bind(destinasi: Destinasi) {
            listGambar.setImageResource(destinasi.image)
            heading.text = destinasi.judul
            deskDes.text = destinasi.desk
            star.setImageResource(destinasi.star)
            rate.text = destinasi.rating.toString()
            like.setImageResource(destinasi.like)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DestinasiViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.list_destinasi, parent, false)
        return DestinasiViewHolder(view)
    }

    override fun onBindViewHolder(holder: DestinasiViewHolder, position: Int) {
        val destinasiItem = destinasi[position]
        holder.bind(destinasiItem)
    }

    override fun getItemCount(): Int {
        return destinasi.size
    }
}

