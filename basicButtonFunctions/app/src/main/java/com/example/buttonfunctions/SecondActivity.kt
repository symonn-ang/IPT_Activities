package com.example.buttonfunctions

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.ImageView
import android.graphics.Color


class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        val bgImage = findViewById<ImageView>(R.id.imageView3)
        bgImage.setColorFilter(Color.parseColor("#80000000"))
    }
}