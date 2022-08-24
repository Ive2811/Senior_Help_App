package com.example.proyectois

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.proyectois.databinding.ActivityMain3Binding
import com.example.proyectois.databinding.ActivityCapacitacionBinding
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase

private lateinit var binding: ActivityCapacitacionBinding

class CapacitacionActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCapacitacionBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.imagenPasos.setOnClickListener {
            startActivity(Intent(this, PrimerosPasos::class.java))
        }
        binding.imagenAyuda.setOnClickListener {
            startActivity(Intent(this,Ayuda::class.java))
        }
        binding.imagenApartados.setOnClickListener {
            startActivity(Intent(this,Apartados::class.java))
        }
        binding.imagenPreguntas.setOnClickListener {
            startActivity(Intent(this,Preguntas::class.java))
        }

        binding.imgbtnPpLogro.setOnClickListener {
            startActivity(Intent(this,MisLogros::class.java))
        }
    }



}

