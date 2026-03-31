package com.example.aulabasico

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)
        val btn = findViewById<Button>(R.id.button)
        val imageView = findViewById<ImageView>(R.id.imageView)

        Glide
            .with(this)
            .load("https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/1.png")
            .into(imageView)

        btn.setOnClickListener {
            val number = (1..200).random()

            getPhotoRandom(number = number, image = imageView)
        }
    }

    private fun getPhotoRandom(number: Int, image: ImageView) {
        Glide
            .with(this)
            .load("https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/${number}.png")
            .into(image)
    }
}