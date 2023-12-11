package com.example.recycleview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class AlbumAdapter(private val albumList:ArrayList<album>)
    : RecyclerView.Adapter<AlbumAdapter.AlbumViewHolder>(){

    var onItemClick : ((album) -> Unit)? = null

    class  AlbumViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        val imageView : ImageView = itemView.findViewById(R.id.imageView)
        val textView : TextView = itemView.findViewById(R.id.textView)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AlbumViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.activity_item , parent , false)
        return AlbumViewHolder(view)
    }

    override fun getItemCount(): Int {
        return albumList.size
    }

    override fun onBindViewHolder(holder: AlbumViewHolder, position: Int) {
        val album = albumList[position]
        holder.imageView.setImageResource(album.image)
        holder.textView.text = album.name

        holder.itemView.setOnClickListener{
            onItemClick?.invoke(album)

        }

    }
}