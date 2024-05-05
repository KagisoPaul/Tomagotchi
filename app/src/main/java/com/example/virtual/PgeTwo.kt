package com.example.virtual

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide

class PgeTwo : AppCompatActivity() {

    private var health = 100
    private var hunger = 0
    private var cleanliness = 100

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_pge_two)

        val openPgeTwoButton: Button = findViewById(R.id.backBtn)
        openPgeTwoButton.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        val petImage: ImageView = findViewById(R.id.petImage)
        val eatButton: Button = findViewById(R.id.eatBtn)
        val cleanButton: Button = findViewById(R.id.cleanBtn)
        val playButton: Button = findViewById(R.id.playBtn)
        val resetButton: Button = findViewById(R.id.resetBtn)

        Glide.with(this)
            .load(R.drawable.jakestill)
            .into(petImage)

        eatButton.setOnClickListener{
            feedPet()
            Glide.with(this)
                .load(R.drawable.jakeeating)
                .into(petImage)
        }

        cleanButton.setOnClickListener{
            cleanPet()
            Glide.with(this)
                .load(R.drawable.jakecleaning)
                .into(petImage)
        }

        playButton.setOnClickListener{
            playWithPet()
            Glide.with(this)
                .load(R.drawable.jakeplaying)
                .into(petImage)
        }

        resetButton.setOnClickListener{
            resetPet()
            Glide.with(this)
                .load(R.drawable.jakestill)
                .into(petImage)
        }

        updateStatusText()
    }

    private fun playWithPet() {
        if (hunger + 10 <= 100) {
            hunger += 10
        } else {
            hunger = 100
        }

        if (cleanliness - 10 >= 0) {
            cleanliness -= 10
        } else {
            cleanliness = 0
        }

        if (health - 5 >= 0) {
            health -= 5
        } else {
            health = 0
        }

        updateStatusText()
    }

    private fun cleanPet() {
        if (cleanliness + 20 <= 100) {
            cleanliness += 20
        } else {
            cleanliness = 100
        }

        if (hunger + 5 <= 100) {
            hunger += 5
        } else {
            hunger = 100
        }

        updateStatusText()
    }

    private fun feedPet() {
        if (hunger - 20 >= 0) {
            hunger -= 20
        } else {
            hunger = 0
        }

        if (health + 10 <= 100) {
            health += 10
        } else {
            health = 100
        }

        updateStatusText()
    }


    private fun resetPet() {
        val statusText: TextView = findViewById(R.id.statusText)

        health = 100
        hunger = 0
        cleanliness = 100
        statusText.text = "Health: $health Hunger: $hunger Cleanliness: $cleanliness"

    }


    private fun updateStatusText() {
        val statusText: TextView = findViewById(R.id.statusText)
        statusText.text = "Health: $health Hunger: $hunger Cleanliness: $cleanliness"
    }
}