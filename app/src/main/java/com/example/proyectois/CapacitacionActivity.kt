package com.example.proyectois

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.proyectois.databinding.ActivityCapacitacionBinding
import android.widget.Button
import android.media.MediaPlayer

class CapacitacionActivity : AppCompatActivity() {

    /**
     * Declaramos las variables a utilizar.
     */
    private lateinit var binding: ActivityCapacitacionBinding

    /**
     * Función principal.
     */
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCapacitacionBinding.inflate(layoutInflater)
        setContentView(binding.root)

        /**
         * Al dar click, mostramos la pantalla de primeros pasos.
         */
        binding.imgbtnCapPasos.setOnClickListener {
            startActivity(Intent(this, PrimerosPasos::class.java))
        }

        /**
         * Al dar click, mostramos la pantalla de ayuda.
         */
        binding.imgbtnCapConsejos.setOnClickListener {
            startActivity(Intent(this,Ayuda::class.java))
        }

        /**
         * Al dar click, mostramos la pantalla de Apartados.
         */
        binding.imgbtnCapApartados.setOnClickListener {
            startActivity(Intent(this,Apartados::class.java))
        }

        /**
         * Al dar click, mostramos la pantalla de Preguntas.
         */
        binding.imgbtnpreguntasF.setOnClickListener {
            startActivity(Intent(this,Preguntas::class.java))
        }

        /**
         * Al dar click, mostramos la pantalla de Pantalla principal.
         */
        binding.imgbtnCapHome.setOnClickListener {
            startActivity(Intent(this, MainActivity3::class.java))
        }

        /**
         * Hacemos referencia al botón de capacitación.
         */
        val btn1 = findViewById<Button>(R.id.btn_capacitacion)


        /**
         * Al dar click, reproducimos el audio referente al apartado de capacitación.
         */
        btn1.setOnClickListener {
            val mp = MediaPlayer.create(this, R.raw.capacitacion)
            mp.start()
        }
    }
}