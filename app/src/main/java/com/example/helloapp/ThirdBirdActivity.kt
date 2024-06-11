package com.example.helloapp

import android.content.Intent
import android.os.Bundle
import android.view.View.OnClickListener
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.helloapp.databinding.ActivityMainBinding
import com.example.helloapp.databinding.ActivityThirdBirdBinding

class ThirdBirdActivity : AppCompatActivity() {
    lateinit var binding: ActivityThirdBirdBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityThirdBirdBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val prevFourth = findViewById<ImageView>(R.id.prevfourth)
        val nextFourth = findViewById<ImageView>(R.id.nextFourth)

        prevFourth.setOnClickListener{
            finish()
        }

        nextFourth.setOnClickListener(){
            val intent = Intent(this, FourthBirdActivity::class.java)
            startActivity(intent)
        }
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

    }
}