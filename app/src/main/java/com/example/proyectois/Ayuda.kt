package com.example.proyectois

import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import com.example.proyectois.databinding.ActivityAyudaBinding
import com.example.proyectois.databinding.ActivityPrimerosPasosBinding

private lateinit var binding: ActivityAyudaBinding

class Ayuda : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAyudaBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.imgbtnAyuHome.setOnClickListener {
            startActivity(Intent(this, MainActivity3::class.java))
        }

        val btn1 = findViewById<ImageButton>(R.id.imgbtn_ayu_consejo1)
        val btn2 = findViewById<ImageButton>(R.id.imgbtn_ayu_consejo2)
        val btn3 = findViewById<ImageButton>(R.id.imgbtn_ayu_consejo3)

        btn1.setOnClickListener {
            val mp = MediaPlayer.create(this, R.raw.consejo1)
            mp.start()
        }
        btn2.setOnClickListener {
            val mp = MediaPlayer.create(this, R.raw.consejo2)
            mp.start()
        }
        btn3.setOnClickListener {
            val mp = MediaPlayer.create(this, R.raw.consejo3)
            mp.start()
        }

        binding.imgbtnAyuHome.setOnClickListener {
            startActivity(Intent(this, MainActivity3::class.java))
        }
    }
}