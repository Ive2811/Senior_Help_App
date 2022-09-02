package com.example.proyectois

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.proyectois.databinding.ActivityAyudaBinding
import com.example.proyectois.databinding.ActivityPrimerosPasosBinding

private lateinit var binding: ActivityAyudaBinding

class Ayuda : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAyudaBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.imgbtnAyuAtras.setOnClickListener {
            startActivity(Intent(this, CapacitacionActivity::class.java))
        }
    }
}