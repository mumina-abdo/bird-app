package com.example.helloapp

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.helloapp.databinding.ActivityFourthBirdBinding
import com.example.helloapp.databinding.ActivitySecondBirdBinding
import com.example.helloapp.databinding.ActivityThirdBirdBinding
import com.squareup.picasso.Picasso

class FourthBirdActivity : AppCompatActivity() {
    lateinit var binding: ActivityFourthBirdBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFourthBirdBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val btnPrevD = findViewById<ImageView>(R.id.btnPrevB)
        val btnNextD = findViewById<ImageView>(R.id.btnNextSixthB)
        btnPrevD.setOnClickListener {
            finish()
        }
        btnNextD.setOnClickListener() {
            val intent = Intent(this, SixthBirdActivity::class.java)
            startActivity(intent)

            btnNextD.setOnClickListener {
                finish()
            }

            Picasso
                .get()
                .load("https://i.pinimg.com/236x/c5/db/0d/c5db0d66ed52cd7497517c05d0c2d5c8.jpg")
                .into(binding.imageView3)

        }
    }
}