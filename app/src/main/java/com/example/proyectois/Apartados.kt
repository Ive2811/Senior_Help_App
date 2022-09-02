package com.example.proyectois

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.proyectois.databinding.ActivityApartadosBinding
import com.example.proyectois.databinding.ActivityAyudaBinding

private lateinit var binding: ActivityApartadosBinding

class Apartados : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityApartadosBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.imgbtnAaAtras.setOnClickListener {
            startActivity(Intent(this, CapacitacionActivity::class.java))
        }
    }
}