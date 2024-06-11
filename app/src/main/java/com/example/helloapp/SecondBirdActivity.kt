package com.example.helloapp

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.helloapp.databinding.ActivityMainBinding
import com.example.helloapp.databinding.ActivitySecondBirdBinding
import com.squareup.picasso.Picasso

class SecondBirdActivity : AppCompatActivity() {
    lateinit var binding: ActivitySecondBirdBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBirdBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setContentView(R.layout.activity_second_bird)
        val btnPrev1 = findViewById<ImageView>(R.id.btnPrev7)
        val btnNext1 = findViewById<ImageView>(R.id.btnNext1)


        btnPrev1.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()

        }

        btnNext1.setOnClickListener {
            val intent = Intent(this,ThirdBirdActivity::class.java)
            startActivity(intent)
            finish()
        }

        Picasso
            .get()
            .load("https://i.pinimg.com/236x/c5/db/0d/c5db0d66ed52cd7497517c05d0c2d5c8.jpg")
            .into(binding.imageView2)

    }
}