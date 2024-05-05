package com.example.virtual

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.bumptech.glide.Glide

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val openPgeTwoButton: Button = findViewById(R.id.startButton)
        openPgeTwoButton.setOnClickListener {
            val intent = Intent(this, PgeTwo::class.java)
            startActivity(intent)
        }

        val introImage: ImageView = findViewById(R.id.introImage)

        Glide.with(this)
            .load(R.drawable.jakeintro)
            .into(introImage);
    }
}