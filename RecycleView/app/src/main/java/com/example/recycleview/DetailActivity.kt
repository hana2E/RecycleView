package com.example.recycleview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class DetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)


        val album = intent.getParcelableExtra<album>("album")
        if (album !=null){
            val textView : TextView = findViewById(R.id.detailItemtv)
            val imageView : ImageView = findViewById(R.id.detailItemIv)

            textView.text = album.name
            imageView.setImageResource(album.image)
        }

    }
}