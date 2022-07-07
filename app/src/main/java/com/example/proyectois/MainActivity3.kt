package com.example.proyectois

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.proyectois.databinding.ActivityMain2Binding
import com.example.proyectois.databinding.ActivityMain3Binding
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase

class MainActivity3 : AppCompatActivity() {

    private lateinit var binding: ActivityMain3Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain3Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnPpLogout.setOnClickListener {
            logOut()
        }

        binding.imgbtnPpCap.setOnClickListener {
            startActivity(Intent(this, CapacitacionActivity::class.java))
        }

        binding.imgbtnPpRecor.setOnClickListener {
            startActivity(Intent(this, RecordatoriosActivity::class.java))
        }

        binding.imgbtnPpPerfil.setOnClickListener {
            startActivity(Intent(this, PerfilActivity::class.java))
        }

        binding.imgbtnPpContactos.setOnClickListener {
            startActivity(Intent(this, ContactosActivity::class.java))
        }
    }

    private fun logOut() {
        Firebase.auth.signOut()

        val intent = Intent(applicationContext, MainActivity::class.java)
        startActivity(intent)
        finish()
    }
}