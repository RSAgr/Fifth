package com.example.fifth

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.core.view.WindowInsetsCompat
import androidx.core.view.WindowInsetsControllerCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Handler(Looper.getMainLooper()).postDelayed({startActivity(Intent(this, Main_Screen::class.java))},2000)
        val controller = WindowInsetsControllerCompat(window, window.decorView )
        controller.hide(WindowInsetsCompat.Type.statusBars())

    }
}