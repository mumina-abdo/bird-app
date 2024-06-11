package com.example.helloapp

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.view.inputmethod.InputBinding
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.helloapp.databinding.ActivityMainBinding
import com.squareup.picasso.Picasso

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val btnNext = findViewById<ImageView>(R.id.btnNext1)

        btnNext.setOnClickListener{
            val intent = Intent(this, SecondBirdActivity::class.java)
            startActivity(intent)
            finish()
        }

        Picasso
            .get()
            .load("https://i.pinimg.com/236x/d0/8a/14/d08a14d773ba749b9aaa871708f30d1c.jpg")
            .into(binding.imageView)

    }
}