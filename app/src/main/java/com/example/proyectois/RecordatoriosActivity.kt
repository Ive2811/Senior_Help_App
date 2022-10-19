package com.example.proyectois

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.proyectois.databinding.ActivityAyudaBinding
import com.example.proyectois.databinding.ActivityRecordatoriosBinding

private lateinit var binding: ActivityRecordatoriosBinding

class RecordatoriosActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRecordatoriosBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.imgbtnRecHome.setOnClickListener {
            startActivity(Intent(this, MainActivity3::class.java))
        }
    }
}