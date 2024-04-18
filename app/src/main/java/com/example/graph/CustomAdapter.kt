package com.example.graph

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.FragmentActivity
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView

class CustomAdapter(var list: ArrayList<data>,var requireActivity: FragmentActivity) : RecyclerView.Adapter<CustomAdapter.ViewHolder>() {
    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        lateinit var control: NavController
        val Image: ImageView = itemView.findViewById(R.id.image)
        val Name: TextView = itemView.findViewById(R.id.name)
        val Description: TextView = itemView.findViewById(R.id.description)
        val Image2: ImageView = itemView.findViewById(R.id.image2)
        val Like: ImageView = itemView.findViewById(R.id.like)
        val Comment: ImageView = itemView.findViewById(R.id.comment)
        val Share: ImageView = itemView.findViewById(R.id.share)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustomAdapter.ViewHolder {
        return ViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.shape, parent, false)
        )
    }

    @SuppressLint("ResourceAsColor")
    override fun onBindViewHolder(holder: CustomAdapter.ViewHolder, position: Int) {
        holder.Image.setImageResource(list[position].image)
        holder.Name.text = list[position].name
        holder.Description.text=list[position].description
        holder.Image2.setImageResource(list[position].image2)
        holder.Like.setImageResource(list[position].like)
        holder.Comment.setImageResource(list[position].comment)
        holder.Share.setImageResource(list[position].share)
        holder.itemView.setOnClickListener {
//            holder.control.navigate(R.id.action_frame1_to_frame2)
        }
        var isLiked = false
        holder.Like.setOnClickListener {
            if (!isLiked) {
                holder.Like.setImageResource(R.drawable.like_blue)
                isLiked = true
            } else {
                holder.Like.setImageResource(R.drawable.like)
                isLiked = false
            }
        }

    }

    override fun getItemCount(): Int {
        return list.size
    }
}
