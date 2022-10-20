package com.example.proyectois

import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.proyectois.databinding.ActivityCapacitacionBinding
import com.example.proyectois.databinding.ActivityMisLogrosBinding
import com.example.proyectois.databinding.ActivityPreguntasBinding
import com.example.proyectois.databinding.ActivityPrimerosPasosBinding
private lateinit var binding: ActivityPreguntasBinding

class Preguntas : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPreguntasBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val btn1 = findViewById<Button>(R.id.btn_respuesta1)
        val btn2 = findViewById<Button>(R.id.btn_respuesta2)
        val btn3 = findViewById<Button>(R.id.btn_respuesta3)

        btn1.setOnClickListener {
            val mp = MediaPlayer.create(this, R.raw.respuesta1)
            mp.start()
        }
        btn2.setOnClickListener {
            val mp = MediaPlayer.create(this, R.raw.respuesta2)
            mp.start()
        }
        btn3.setOnClickListener {
            val mp = MediaPlayer.create(this, R.raw.respuesta3)
            mp.start()
        }

        binding.imgbtnPreHome.setOnClickListener {
            startActivity(Intent(this, MainActivity3::class.java))
        }
    }
}