package com.example.proyectois

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.proyectois.databinding.ActivityCapacitacionBinding
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase
import android.widget.Button
import android.media.MediaPlayer
import com.example.proyectois.databinding.ActivityMain2Binding.inflate

private lateinit var binding: ActivityCapacitacionBinding

class CapacitacionActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCapacitacionBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.imgbtnCapPasos.setOnClickListener {
            startActivity(Intent(this, PrimerosPasos::class.java))
        }
        binding.imgbtnCapConsejos.setOnClickListener {
            startActivity(Intent(this,Ayuda::class.java))
        }
        binding.imgbtnCapApartados.setOnClickListener {
            startActivity(Intent(this,Apartados::class.java))
        }
        binding.imgbtnCapPreguntas.setOnClickListener {
            startActivity(Intent(this,Preguntas::class.java))
        }

        binding.imgbtnCapLogros.setOnClickListener {
            startActivity(Intent(this,MisLogros::class.java))
        }

        val btn1 = findViewById<Button>(R.id.btn_capacitacion)

        btn1.setOnClickListener {
            val mp = MediaPlayer.create(this, R.raw.capacitacion)
            mp.start()
        }
        binding.imgbtnCapHome.setOnClickListener {
            startActivity(Intent(this, MainActivity3::class.java))
        }


    }




}

