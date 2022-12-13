package com.example.proyectois

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.proyectois.databinding.ActivityApartadosBinding
import com.example.proyectois.databinding.ActivityApartadosComputadoraBinding
import com.example.proyectois.databinding.ActivityComputadoraBinding
import com.example.proyectois.databinding.ActivityUsoWordBinding

class Activity_ApartadosComputadora : AppCompatActivity() {
    /**
     * Declaramos las variables a utilizar.
     */
    private lateinit var binding: ActivityApartadosComputadoraBinding

    /**
     * Función principal.
     */
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityApartadosComputadoraBinding.inflate(layoutInflater)
        setContentView(binding.root)

        /**
         * Al dar click, mostramos la pantalla de Capacitación.
         */
        binding.imgbtnAcHome.setOnClickListener {
            startActivity(Intent(this, CapacitacionActivity::class.java))
        }
/**
 * Al dar click, mostramos la pantalla de Aspectos básicos de una computadora.
 */
        binding.imgbtnAcApartado1.setOnClickListener {
            startActivity(Intent(this,activity_computadora::class.java))
        }

        /**
         * Al dar click, mostramos la pantalla de cómo usar Word.
         */
        binding.imgbtnAcApartado2.setOnClickListener {
            startActivity(Intent(this, activity_usoWord::class.java))
        }
    }
}