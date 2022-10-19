package com.example.proyectois

import android.content.Context
import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
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



        binding.imgbtnPpContactos.setOnClickListener {
            startActivity(Intent(this, ContactosActivity::class.java))
        }
        val btn1 = findViewById<Button>(R.id.btn_princpal)

        btn1.setOnClickListener {
            val mp = MediaPlayer.create(this, R.raw.principal)
            mp.start()
        }
    }

    private fun logOut() {
        Firebase.auth.signOut()

        val intent = Intent(applicationContext, MainActivity::class.java)
        startActivity(intent)
        finish()
    }
}