package com.example.proyectois

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.proyectois.databinding.ActivityMain2Binding
import com.example.proyectois.databinding.ActivityMain3Binding

class MainActivity3 : AppCompatActivity() {

    private lateinit var binding: ActivityMain3Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain3Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnPpLogout.setOnClickListener {
            logOut()
        }
    }

    private fun logOut() {
        val sp = getSharedPreferences("my_prefs", Context.MODE_PRIVATE)
        with(sp.edit()){
          putString("active", "false")
            apply()
        }
        startActivity(Intent(this,MainActivity::class.java))
        finish()
    }
}