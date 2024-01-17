package com.example.fifth

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class ai : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ai)
        val btn = findViewById<ImageButton>(R.id.imageButton3)
        btn.setOnClickListener { startActivity(Intent(this, Main_Screen::class.java))
            finish()
    }
}}