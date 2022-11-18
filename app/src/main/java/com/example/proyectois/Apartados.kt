package com.example.proyectois

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.proyectois.databinding.ActivityApartadosBinding
import com.example.proyectois.databinding.ActivityAyudaBinding

class Apartados : AppCompatActivity() {
    /**
     * Declaramos las variables a utilizar.
     */
    private lateinit var binding: ActivityApartadosBinding

    /**
     * Función principal.
     */
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityApartadosBinding.inflate(layoutInflater)
        setContentView(binding.root)

        /**
         * Al dar click, mostramos la pantalla de Capacitación.
         */
        binding.imgbtnAaHome.setOnClickListener {
            startActivity(Intent(this, CapacitacionActivity::class.java))
        }
    }
}