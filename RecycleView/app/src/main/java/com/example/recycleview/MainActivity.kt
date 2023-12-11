package com.example.recycleview

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var albumList: ArrayList<album>
    private lateinit var albumAdapter: AlbumAdapter

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.recycleview)
        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager = LinearLayoutManager(this)

        albumList = ArrayList()

        albumList.add((album(R.drawable.album1 , "Map of Soul")))
        albumList.add((album(R.drawable.album2 , "Wings")))
        albumList.add((album(R.drawable.album3 , "Bullet Prof")))
        albumList.add((album(R.drawable.album4 , "Skool Luv Affair")))
        albumList.add((album(R.drawable.album5 , "LY")))
        albumList.add((album(R.drawable.album6 , "Agust D")))

        albumList.add((album(R.drawable.album1 , "Map of Soul")))
        albumList.add((album(R.drawable.album2 , "Wings")))
        albumList.add((album(R.drawable.album3 , "Bullet Prof")))
        albumList.add((album(R.drawable.album4 , "Skool Luv Affair")))


        albumAdapter = AlbumAdapter(albumList)
        recyclerView.adapter =  albumAdapter

        albumAdapter.onItemClick = {album
            val intent = Intent(this ,DetailActivity::class.java)
            intent.putExtra("ALBUM" , it)
            startActivity(intent)
        }

    }
}