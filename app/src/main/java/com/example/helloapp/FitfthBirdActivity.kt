package com.example.helloapp

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.helloapp.databinding.ActivityFitfthBirdBinding
import com.example.helloapp.databinding.ActivityFourthBirdBinding
import com.squareup.picasso.Picasso

class FitfthBirdActivity : AppCompatActivity() {
    lateinit var binding: ActivityFitfthBirdBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFitfthBirdBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val btnPrevB = findViewById<ImageView>(R.id.btnPrevB)
        val btnNextB = findViewById<ImageView>(R.id.btnNextSixthB)


        btnPrevB.setOnClickListener {
            val intent = Intent(this, SixthBirdActivity::class.java)
            startActivity(intent)
            finish()

        }

        btnNextB.setOnClickListener {
            finish()
        }
        Picasso
            .get()
            .load("https://i.pinimg.com/236x/f2/1b/c3/f21bc309ceb6724a547e3f6016271f8d.jpg")
            .into(binding.imageView4)

    }
}
