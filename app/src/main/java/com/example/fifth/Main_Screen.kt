package com.example.fifth

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class Main_Screen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_screen)
        val btn1 = findViewById<ImageButton>(R.id.imgBut1)
        btn1.setOnClickListener {startActivity(Intent(this, food ::class.java)) }
        val btn2 = findViewById<ImageButton>(R.id.imgBut2)
        btn2.setOnClickListener { startActivity(Intent(this, exercise::class.java)) }
        val btn3 = findViewById<ImageButton>(R.id.imgBut3)
        btn3.setOnClickListener { startActivity(Intent(this, book::class.java)) }
        val btn4 = findViewById<ImageButton>(R.id.imgBut4)
        btn4.setOnClickListener { startActivity(Intent(this, psy::class.java)) }
        val btn5 = findViewById<ImageButton>(R.id.imgAge)
        btn5.setOnClickListener { startActivity(Intent(this, Age::class.java)) }

    }
}