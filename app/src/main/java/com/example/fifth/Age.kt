package com.example.fifth

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract.CommonDataKinds.Note
import android.renderscript.Sampler.Value
import android.widget.Button
import android.widget.ImageButton
import androidx.annotation.OptIn
import androidx.core.content.ContextCompat.startActivity
import androidx.media3.common.util.Log
import androidx.media3.common.util.UnstableApi
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.database.ValueEventListener

class Age : AppCompatActivity() {
    private var firebaseDatabase: FirebaseDatabase? = null
    private var databaseReference: DatabaseReference? = null
    private var list = mutableListOf<Note>()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_age)
        val btn = findViewById<ImageButton>(R.id.imageButton)
        btn.setOnClickListener { startActivity(Intent(this, Main_Screen::class.java))
        finish()}
    }
}








